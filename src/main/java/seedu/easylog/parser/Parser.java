package seedu.easylog.parser;

import seedu.easylog.commands.ExitCommand;
import seedu.easylog.commands.itemscommands.ItemsAddFromFileCommand;
import seedu.easylog.commands.orderscommands.OrdersAddFromFileCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.InvalidFileInputException;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.ui.Ui;

import java.io.IOException;

/**
 * Process raw user input.
 */
public class Parser {

    public static Ui ui = new Ui();

    public static String[] splitCommandWordAndArgs(String rawUserInput) {
        String[] splitCommand = rawUserInput.split(" ", 2);
        return splitCommand.length == 2 ? splitCommand : new String[]{splitCommand[0], ""};
    }

    public void processUserInput(String rawUserInput, ItemManager itemManager, OrderManager orderManager) throws IOException {
        String[] commandTypeAndParams = splitCommandWordAndArgs(rawUserInput);
        String commandType = commandTypeAndParams[0];
        String commandArgs = commandTypeAndParams[1];
        switch (commandType) {
        case (Constants.COMMAND_HELP):
            ui.showHelp();
            break;
        case (Constants.COMMAND_EXIT):
            new ExitCommand().execute(itemManager, orderManager);
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

    public void processFileInput(String commandType, String commandArgs, ItemManager itemManager,
                                 OrderManager orderManager) throws InvalidFileInputException {
        switch (commandType) {
        case (Constants.COMMAND_ITEMS):
            new ItemsAddFromFileCommand().execute(commandArgs, itemManager);
            break;
        case (Constants.COMMAND_ORDERS):
            new OrdersAddFromFileCommand().execute(commandArgs, itemManager, orderManager);
            break;
        default:
            throw new InvalidFileInputException();
        }
    }
}
