package seedu.easylog;

import seedu.easylog.common.Constants;
import seedu.easylog.parser.Parser;
import seedu.easylog.ui.Ui;

import java.util.logging.Logger;
import java.util.Scanner;

public class EasyLog {

    private static final Ui ui = new Ui();
    private static final Parser parser = new Parser();

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final Logger logger = Logger.getLogger(EasyLog.class.getName());

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) {
        logger.info("The program starts!");
        ui.showGreeting();
        while (true) {
            String userInput = Constants.SCANNER.nextLine();
            parser.processUserInput(userInput);
        }
    }

}
