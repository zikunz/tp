package seedu.easylog.storage;

import seedu.easylog.exceptions.InvalidFileInputException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveData extends Storage {

    /**
     * Load save file if any.
     * @param itemManager
     * @param orderManager
     * @throws FileNotFoundException when no save file found.
     * @throws InvalidFileInputException when line from file cannot is in invalid format.
     */
    public void loadFile(ItemManager itemManager, OrderManager orderManager) throws FileNotFoundException {
        ui.showLookingForSaveData();
        File saveData = new File("easyLog.txt");
        if (saveData.exists()) {
            ui.showSaveDataLoading();
        }
        Scanner s = new Scanner(saveData);
        int fileLine = 1;
        while (s.hasNext()) {
            String fileInput = s.nextLine();
            String[] splitCommandTypeAndArgs = parser.splitCommandWordAndArgs(fileInput);
            String commandType = splitCommandTypeAndArgs[0];
            String commandArgs = splitCommandTypeAndArgs[1];
            try {
                parser.processFileInput(commandType, commandArgs, itemManager, orderManager);
            } catch (InvalidFileInputException e) {
                ui.showInvalidFileInputLine(fileLine);
            }
            ++fileLine;
        }
        ui.showSaveDataLoaded();
    }

    /**
     * Save data to save file.
     * @param itemManager
     * @param orderManager
     * @throws IOException when there is an error during the saving of the file.
     */
    public void saveFile(ItemManager itemManager, OrderManager orderManager) throws IOException {
        File saveData = new File("easyLog.txt");
        if (saveData.createNewFile()) {
            ui.showSaveDataCreated();
        }
        FileWriter fw = new FileWriter("easyLog.txt");
        for (Item item: itemManager.getItemList()) {
            fw.write("items " + item.saveToFileFormat() + "\n");
        }
        for (Order order: orderManager.getOrderList()) {
            fw.write("orders " + order.saveToFileFormat(itemManager) + "\n");
        }
        fw.close();
        ui.showSaveDataSaved();
    }
}
