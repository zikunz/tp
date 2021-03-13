package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.ItemListAlreadyClearedException;

public class ItemsClearCommand extends ItemsCommand {

    public void execute() throws ItemListAlreadyClearedException {
        if (itemManager.getSize() == 0) {
            throw new ItemListAlreadyClearedException();
        }
        ui.showClearItemList();
        itemManager.clearItemList();
    }
}
