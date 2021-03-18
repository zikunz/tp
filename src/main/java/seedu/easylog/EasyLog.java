package seedu.easylog;

import seedu.easylog.common.Constants;
import seedu.easylog.parser.Parser;
import seedu.easylog.ui.Ui;

public class EasyLog {

    private static final Ui UI = new Ui();
    private static final Parser PARSER = new Parser();

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) {
        UI.showGreeting();
        while (true) {
            String userInput = Constants.SCANNER.nextLine();
            PARSER.processUserInput(userInput);
        }
    }

}
