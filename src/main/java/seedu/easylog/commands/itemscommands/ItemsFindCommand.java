package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.ItemNotFound;
import seedu.easylog.item.ItemManager;

public class ItemsFindCommand extends ItemsCommand {
    /**
     * Print out all the found items in the found list.
     */
    public void execute(String itemDescription, ItemManager itemManager) throws EmptyNameException, ItemNotFound {
        if (itemDescription.equals("")) {
            throw new EmptyNameException();
        }
        itemManager.findItem(itemDescription);

        boolean shouldIncludeIndentation = false;

        String rawFoundListOutput =
                itemManager.getItemListPrintFormat(itemManager.getFoundList(), shouldIncludeIndentation);
        ui.showItemList(rawFoundListOutput);
        itemManager.clearFoundList();
    }
}
