package seedu.easylog.commands.itemscommands;

import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

import java.math.BigDecimal;

public class ItemsAddFromFileCommand extends ItemsCommand {

    public void execute(String itemFileInput, ItemManager itemManager) {
        String[] rawItemFileInput = itemFileInput.split(" ");
        String itemName = rawItemFileInput[0];
        BigDecimal itemPrice = new BigDecimal(rawItemFileInput[1]);
        int itemStock = Integer.parseInt(rawItemFileInput[2]);
        Item itemToBeAddedFromFile = new Item(itemName, itemPrice, itemStock);
        itemManager.addItem(itemToBeAddedFromFile);
    }
}
