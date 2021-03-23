package seedu.easylog.commands;

import seedu.easylog.storage.SaveData;
import seedu.easylog.ui.Ui;

public abstract class Command {

    public Ui ui = new Ui();
    public SaveData saveData = new SaveData();
}
