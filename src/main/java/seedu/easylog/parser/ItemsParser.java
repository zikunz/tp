package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyNumberException;

/**
 * Process items command input.
 */
public class ItemsParser extends Parser {

    public static void processItemsInput(String itemsArg) {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsArg);
        String commandType = splitItemsArg[0];
        String commandArgs = splitItemsArg[1];
        switch (commandType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(commandArgs);
            } catch (EmptyNameException e) {
                ui.showEmptyName();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new ItemsDeleteCommand().execute(commandArgs);
            } catch (EmptyNumberException e) {
                ui.showEmptyNumber();
            }
            break;
        default:
            ui.showItemsHelp();
        }
    }
}
