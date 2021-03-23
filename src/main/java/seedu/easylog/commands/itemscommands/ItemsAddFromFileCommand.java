package seedu.easylog.commands.itemscommands;

import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

import java.math.BigDecimal;

public class ItemsAddFromFileCommand extends ItemsCommand {

    /**
     * Execute the required actions to add file input related to item into the inventory.
     * @param itemFileInput Item details from file to be added into the inventory.
     * @param itemManager Manipulates inventory.
     */
    public void execute(String itemFileInput, ItemManager itemManager) {
        String[] rawItemFileInput = itemFileInput.split(" ");
        String itemName = rawItemFileInput[0];
        BigDecimal itemPrice = new BigDecimal(rawItemFileInput[1]);
        int itemStock = Integer.parseInt(rawItemFileInput[2]);
        Item itemToBeAddedFromFile = new Item(itemName, itemPrice, itemStock);
        itemManager.addItem(itemToBeAddedFromFile);
    }
}
