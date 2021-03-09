package seedu.easylog.commands.itemscommands;

import seedu.easylog.item.ItemManager;
import seedu.easylog.ui.Ui;

public abstract class ItemsCommand {

    public ItemManager itemManager = new ItemManager();
    public Ui ui = new Ui();
}
