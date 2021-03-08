package seedu.easyLog.commands.itemscommands;

import seedu.easyLog.exceptions.EmptyNameException;
import seedu.easyLog.item.Item;

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
