
package seedu.easylog.item;

import java.util.ArrayList;

/**
 * Manage item list manipulation commands.
 */
public class ItemManager {

    private static final ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * Obtains all the Items in the itemList
     */
    public String getItemList() {
        int taskCount = 1;
        String itemsOutput = "";
        for (Item item : itemList) {
            itemsOutput += taskCount + ". " + item.getItemName() + "\n";
            taskCount++;
        }
        return itemsOutput;
    }

    public void deleteItem(int index) {
        itemList.remove(index);
    }
}
