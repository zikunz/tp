package seedu.easylog.commands.itemscommands;

public class ItemsListCommand extends ItemsCommand {

    public void execute() {
        boolean shouldIncludeIndentation = false;

        String rawItemList =
                itemManager.getItemListPrintFormat(itemManager.getItemList(), shouldIncludeIndentation);
        ui.showItemList(rawItemList);

    }
}
