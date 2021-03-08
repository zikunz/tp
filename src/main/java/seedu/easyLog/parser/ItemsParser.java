package seedu.easyLog.parser;

import seedu.easyLog.commands.itemscommands.ItemsAddCommand;
import seedu.easyLog.common.Constants;
import seedu.easyLog.exceptions.EmptyNameException;

public class ItemsParser extends Parser {

    public static void processItemsInput(String itemsArg) {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsArg);
        String commandType = splitItemsArg[0];
        String commandArgs = splitItemsArg[1];
        switch(commandType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(commandArgs);
            } catch (EmptyNameException e) {
                ui.showEmptyName();
            }
        default:
            ui.showItemsHelp();
        }
    }
}
