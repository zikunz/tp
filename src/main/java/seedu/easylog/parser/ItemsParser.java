package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;

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
        default:
            ui.showItemsHelp();
        }
    }
}
