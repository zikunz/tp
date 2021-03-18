package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

public class ItemsAddCommand extends ItemsCommand {
    /**
     * Adds items to the system.
     */
    public void execute(String itemsArg, ItemManager itemManager) throws EmptyNameException {
        if (itemsArg.equals("")) {
            throw new EmptyNameException();
        }
        Item item = new Item(itemsArg);
        itemManager.addItem(item);
        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }
}
