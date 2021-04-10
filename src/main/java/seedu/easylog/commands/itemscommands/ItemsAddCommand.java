package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemNameException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.InvalidTotalItemStockException;
import seedu.easylog.exceptions.NonIntegerItemStockException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NullItemNameException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.ItemNameTooLongException;
import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;

public class ItemsAddCommand extends ItemsCommand {

    /**
     * Adds items to the system.
     *
     * @param itemDescription description of an item
     * @param itemManager     item manager
     */
    public void execute(String itemDescription, ItemManager itemManager)
            throws EmptyItemNameException, NonIntegerItemStockException, NonNumericItemPriceException,
            InvalidTotalItemStockException, NullItemNameException, NullItemStockException, EmptyItemStockException,
            InvalidItemStockException, ItemNameTooLongException {
        if (itemDescription == null) {
            throw new NullItemNameException();
        }

        if (itemDescription.equals("")) {
            throw new EmptyItemNameException();
        }

        if (itemDescription.length() > Constants.ITEM_NAME_LENGTH_LIMIT) {
            throw new ItemNameTooLongException();
        }

        Item item = itemsParser.promptAndProcessItemPriceAndStock(itemDescription);
        itemManager.addItem(item);

        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }
}
