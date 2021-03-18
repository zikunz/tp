package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;

public class ItemsAddCommand extends ItemsCommand {
    /**
     * Adds items to the system.
     */
    public void execute(String itemsArg) throws EmptyNameException {
        if (itemsArg.equals("")) {
            throw new EmptyNameException();
        }
        Item item = new Item(itemsArg);
        itemManager.addItem(item);
        assert itemManager.getLatestItemAdded().equals(item);
        ui.showAddItem(item);
    }
}
