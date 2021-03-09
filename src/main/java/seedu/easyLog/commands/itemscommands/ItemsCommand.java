package seedu.easylog.commands.itemscommands;

import seedu.easylog.item.*;
import seedu.easylog.ui.Ui;

public abstract class ItemsCommand {

    public ItemManager itemManager = new ItemManager();
    public Ui ui = new Ui();
}
