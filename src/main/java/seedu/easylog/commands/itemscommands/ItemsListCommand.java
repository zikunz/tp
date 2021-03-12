package seedu.easylog.commands.itemscommands;

public class ItemsListCommand extends ItemsCommand {

    public void execute() {
        String rawItemListOutput = itemManager.getItemListPrintFormat(itemManager.getItemList());
        ui.showItemList(rawItemListOutput);
    }
}
