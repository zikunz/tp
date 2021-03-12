package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNumberException;

public class ItemsDeleteCommand extends ItemsCommand {

    public void execute(String commandArgs) throws EmptyNumberException {
        if (commandArgs.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(commandArgs) - Constants.ARRAY_OFFSET;
        ui.showDeletedItem(itemManager.getItem(index));
        itemManager.deleteItem(index);
    }
}