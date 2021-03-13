package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.ItemListAlreadyEmptyException;

public class ItemsEmptyCommand extends ItemsCommand {

    public void execute() throws ItemListAlreadyEmptyException {
        if (itemManager.getSize() == 0) {
            throw new ItemListAlreadyEmptyException();
        }
        ui.showEmptyItemList();
        itemManager.EmptyItemList();
    }
}
