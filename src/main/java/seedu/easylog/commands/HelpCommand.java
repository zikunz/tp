package seedu.easylog.commands;

public class HelpCommand extends Command {

    public void execute() {
        ui.showHelp();
    }
}
