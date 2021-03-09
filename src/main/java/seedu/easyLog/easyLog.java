package seedu.easylog;

import java.util.Scanner;
import seedu.easylog.ui.Ui;
import seedu.easylog.parser.Parser;


public class EasyLog {

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
