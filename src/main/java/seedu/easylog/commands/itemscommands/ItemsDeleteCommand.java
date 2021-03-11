package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.item.Item;

public class ItemsDeleteCommand extends ItemsCommand {

    public void execute(String commandArgs) throws EmptyNumberException {
        if (commandArgs.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(commandArgs);
        ui.showDeletedItem(itemManager.getItem(index));
        itemManager.deleteItem(index);
    }
}