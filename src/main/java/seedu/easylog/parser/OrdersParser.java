package seedu.easylog.parser;

import seedu.easylog.common.Constants;

/**
 * Process orders commands input.
 */
public class OrdersParser extends Parser {

    public static void processOrdersInput(String ordersInput) {
        String[] splitOrdersArg = splitCommandWordAndArgs(ordersInput);
        String ordersType = splitOrdersArg[0];
        String ordersArg = splitOrdersArg[1];
        switch (ordersType) {
        case (Constants.COMMAND_ADD):
            break;
        case (Constants.COMMAND_DELETE):
            break;
        case(Constants.COMMAND_LIST):
            break;
        default:
            ui.showOrdersHelp();
        }
    }
}
