package seedu.easylog.commands;

import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;

import java.io.IOException;

public class ExitCommand extends Command {

    public void execute(ItemManager itemManager, OrderManager orderManager) throws IOException {
        try {
            saveData.saveFile(itemManager, orderManager);
        } catch (IOException e) {
            ui.showErrorWhileSaving();
        }
        ui.showExit();
        System.exit(0);
    }
}
