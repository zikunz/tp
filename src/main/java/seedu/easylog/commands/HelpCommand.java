package seedu.easylog.commands;

/**
 * Prints out the list of available commands in the program.
 */
public class HelpCommand extends Command {

    public void execute() {
        ui.showHelp();
    }
}
