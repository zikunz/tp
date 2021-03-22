package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.ItemNotFoundException;
import seedu.easylog.item.ItemManager;

public class ItemsFindCommand extends ItemsCommand {
    /**
     * Print out all the found items in the found list.
     */
    public void execute(String itemDescription, ItemManager itemManager) throws EmptyNameException, ItemNotFoundException {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }
        itemManager.findItem(itemDescription);
        if (itemManager.foundSize() == 0) {
            throw new ItemNotFoundException();
        }
        String rawFoundListOutput = itemManager.getFoundListPrintFormat(itemManager.getFoundList());
        ui.showFoundList(rawFoundListOutput);
        itemManager.clearFoundList();
    }
}
