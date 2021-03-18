package seedu.easylog.parser;

import seedu.easylog.commands.ExitCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.ui.Ui;

/**
 * Process raw user input.
 */
public class Parser {

    public static Ui ui = new Ui();

    public static String[] splitCommandWordAndArgs(String rawUserInput) {
        String[] splitCommand = rawUserInput.split(" ", 2);
        return splitCommand.length == 2 ? splitCommand : new String[]{splitCommand[0], ""};
    }

    public void processUserInput(String rawUserInput, ItemManager itemManager, OrderManager orderManager) {
        String[] commandTypeAndParams = splitCommandWordAndArgs(rawUserInput);
        String commandType = commandTypeAndParams[0];
        String commandArgs = commandTypeAndParams[1];
        switch (commandType) {
        case (Constants.COMMAND_HELP):
            ui.showHelp();
            break;
        case (Constants.COMMAND_EXIT):
            new ExitCommand().execute();
            break;
        case (Constants.COMMAND_ITEMS):
            ItemsParser.processItemsInput(commandArgs, itemManager);
            break;
        case (Constants.COMMAND_ORDERS):
            OrdersParser.processOrdersInput(commandArgs, itemManager, orderManager);
            break;
        default:
            ui.showInvalidCommand();
        }
    }
}
