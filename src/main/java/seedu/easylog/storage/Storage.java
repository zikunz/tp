package seedu.easylog.storage;

import seedu.easylog.parser.Parser;
import seedu.easylog.ui.Ui;

public class Storage {

    public Ui ui = new Ui();
    public Parser parser = new Parser();
    public Logging logging = new Logging();
}
