package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;

public class ItemsDeleteCommand extends ItemsCommand {
    /**
     * Deletes a single item from the list of items.
     */
    public void execute(String itemsArg) throws EmptyNumberException, InvalidNumberException, NumberFormatException {
        if (itemsArg.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(itemsArg) - Constants.ARRAY_OFFSET;
        int size = itemManager.getSize();
        if ((index < 0) || (index >= size)) {
            throw new InvalidNumberException();
        }
        ui.showDeletedItem(itemManager.getItem(index));
        itemManager.deleteItem(index);
        assert itemManager.getSize() == size - 1 : "After a valid deletion, one item is deleted.";
    }
}