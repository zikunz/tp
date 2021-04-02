package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.InvalidTotalItemStockException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;

import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ItemsAddCommand extends ItemsCommand {

    /**
     * Adds items to the system.
     *
     * @param itemDescription       description of an item
     * @param itemManager           item manager
     * @param itemDescriptionRecord ArrayList of item descriptions
     */
    public void execute(String itemDescription, ItemManager itemManager, ArrayList<String> itemDescriptionRecord)
            throws EmptyNameException, EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException,
            NullItemStockException, EmptyItemStockException, InvalidItemStockException, InvalidTotalItemStockException,
            NonNumericItemPriceException, NonIntegerNumericItemStockException {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }

        boolean itemAlreadyExists = false;
        if (itemDescriptionRecord.contains(itemDescription)) {
            handleAnItemWhichAlreadyExists(itemDescriptionRecord, itemDescription, itemManager);
            return;
        }

        ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();
        BigDecimal itemPrice = itemsPromptPriceCommand.execute();

        ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();
        int itemStock = itemsPromptStockCommand.execute(itemAlreadyExists);


        Item item = new Item(itemDescription, itemPrice, itemStock);
        itemManager.addItem(item);
        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }

    /**
     * Handles an item which already exists. That is,
     * the user will be prompted to enter the additional stock to be increment
     * the total number of stock.
     *
     * @param itemDescriptionRecord the arrayList of all item descriptions in the system
     * @param itemDescription       the description of an item
     * @param itemManager           item manager
     */
    private void handleAnItemWhichAlreadyExists(ArrayList<String> itemDescriptionRecord,
                                                String itemDescription, ItemManager itemManager) throws
            NullItemStockException, EmptyItemStockException, InvalidItemStockException, InvalidTotalItemStockException,
            NonIntegerNumericItemStockException {
        ui.showItemIsAlreadyExisting();

        boolean itemAlreadyExists = true;
        ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();
        int itemStock = itemsPromptStockCommand.execute(itemAlreadyExists);

        int itemIndex = itemDescriptionRecord.indexOf(itemDescription);
        Item itemWhichAlreadyExists = itemManager.getItem(itemIndex);
        int revisedStock = itemStock + itemManager.getItemStock(itemWhichAlreadyExists);
        if (revisedStock > Constants.MAXIMUM_ITEM_STOCK) {
            throw new InvalidTotalItemStockException();
        }
        itemManager.setRevisedItemStock(itemIndex, revisedStock);
        ui.showUpdateItemStock();
    }
}
