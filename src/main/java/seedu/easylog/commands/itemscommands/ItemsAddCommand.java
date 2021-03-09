package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;

public class ItemsAddCommand extends ItemsCommand {

    public void execute(String commandArgs) throws EmptyNameException {
        if (commandArgs.equals("")) {
            throw new EmptyNameException();
        }
        Item item = new Item(commandArgs);
        itemManager.addItem(item);
        ui.showAddItem(item);
    }
}
