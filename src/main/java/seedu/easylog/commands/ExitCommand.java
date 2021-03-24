package seedu.easylog.commands;

import seedu.easylog.model.ItemManager;
import seedu.easylog.model.OrderManager;

import java.io.IOException;

public class ExitCommand extends Command {

    public void execute(ItemManager itemManager, OrderManager orderManager) throws IOException {
        try {
            saveData.saveFile(itemManager, orderManager);
        } catch (IOException e) {
            ui.showErrorWhileSaving();
        }
        ui.showExit();
        logging.writeInfoLevelLog("Exiting app now.");
        System.exit(0);
    }
}
