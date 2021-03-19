package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

public class ItemsAddCommand extends ItemsCommand {
    /**
     * Adds items to the system.
     */
    public void execute(String itemDescription, ItemManager itemManager) throws EmptyNameException,
            EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException, NonNumericItemPriceException {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }

        ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();
        String itemPrice = itemsPromptPriceCommand.execute();

        Item item = new Item(itemDescription, itemPrice);
        itemManager.addItem(item);
        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }
}
