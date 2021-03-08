package seedu.easyLog;

import java.util.Scanner;
import seedu.easyLog.ui.Ui;
import seedu.easyLog.parser.Parser;


public class easyLog {

    private static Ui ui = new Ui();
    private static Parser parser = new Parser();

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) {
        ui.showGreeting();
        while (true) {
            String userInput = SCANNER.nextLine();
            parser.processUserInput(userInput);
        }
    }

}
