package seedu.easylog;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.InvalidFileInputException;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.parser.Parser;
import seedu.easylog.storage.SaveData;
import seedu.easylog.ui.Ui;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EasyLog {

    private static final Ui UI = new Ui();
    private static final Parser PARSER = new Parser();
    private static final ItemManager ITEM_MANAGER = new ItemManager();
    private static final OrderManager ORDER_MANAGER = new OrderManager();
    private static final SaveData SAVE_DATA = new SaveData();

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) throws IOException {
        UI.showGreeting();
        try {
            SAVE_DATA.loadFile(ITEM_MANAGER, ORDER_MANAGER);
        } catch (FileNotFoundException e) {
            UI.showNoSaveDataFound();
        }
        while (true) {
            String userInput = Constants.SCANNER.nextLine();
            PARSER.processUserInput(userInput, ITEM_MANAGER, ORDER_MANAGER);
        }
    }
}
