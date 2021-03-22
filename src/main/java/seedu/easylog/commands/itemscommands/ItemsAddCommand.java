package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

import java.math.BigDecimal;

public class ItemsAddCommand extends ItemsCommand {
    /**
     * Adds items to the system.
     */
    public void execute(String itemDescription, ItemManager itemManager) throws EmptyNameException,
            EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException, NullItemStockException,
            EmptyItemStockException, InvalidItemStockException {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }

        ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();
        BigDecimal itemPrice = itemsPromptPriceCommand.execute();

        ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();
        int itemStock = itemsPromptStockCommand.execute();

        Item item = new Item(itemDescription, itemPrice, itemStock);
        itemManager.addItem(item);
        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }
}
