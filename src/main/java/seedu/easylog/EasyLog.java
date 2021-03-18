package seedu.easylog;

import seedu.easylog.common.Constants;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.parser.Parser;
import seedu.easylog.ui.Ui;

public class EasyLog {

    private static final Ui UI = new Ui();
    private static final Parser PARSER = new Parser();
    private static final ItemManager ITEM_MANAGER = new ItemManager();
    private static final OrderManager ORDER_MANAGER = new OrderManager();

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) {
        UI.showGreeting();
        while (true) {
            String userInput = Constants.SCANNER.nextLine();
            PARSER.processUserInput(userInput, ITEM_MANAGER, ORDER_MANAGER);
        }
    }
}
