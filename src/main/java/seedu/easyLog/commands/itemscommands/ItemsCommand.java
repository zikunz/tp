package seedu.easyLog.commands.itemscommands;

import seedu.easyLog.item.*;
import seedu.easyLog.ui.Ui;

public abstract class ItemsCommand {

    public ItemManager itemManager = new ItemManager();
    public Ui ui = new Ui();
}
