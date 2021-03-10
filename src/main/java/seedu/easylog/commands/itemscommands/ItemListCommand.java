package seedu.easylog.commands.itemscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;

public class ItemListCommand extends ItemsCommand {
    public void execute(String commandArgs) throws EmptyNameException {
        if (commandArgs.equals("")) {
            throw new EmptyNameException();
        }
        Item item = new Item(commandArgs);
        String rawItemList = itemManager.getItemList();
        ui.showItemList(rawItemList);
    }
}
