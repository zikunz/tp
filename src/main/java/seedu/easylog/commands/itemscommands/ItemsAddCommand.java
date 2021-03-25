package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.*;
import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;

import java.math.BigDecimal;

public class ItemsAddCommand extends ItemsCommand {
    /**
     * Adds items to the system.
     */
    public void execute(String itemDescription, ItemManager itemManager) throws EmptyNameException,
            EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException, NullItemStockException,
            EmptyItemStockException, InvalidItemStockException, RepeatedItemException {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }

        if (ItemManager.checkRepeatItem(itemDescription)) {
            throw new RepeatedItemException();
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
