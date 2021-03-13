
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

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    /**
     * Get list of items in string format to be printed as output to user.
     *
     * @return String format for the list of items to be printed.
     */
    public String getItemListPrintFormat(ArrayList<Item> itemListToBePrinted) {
        int taskCount = 1;
        String itemsListOutput = "";
        for (Item item : itemListToBePrinted) {
            itemsListOutput += taskCount + ". " + item.getItemName() + "\n";
            ++taskCount;
        }
        return itemsListOutput;
    }

    public void deleteItem(int index) {
        itemList.remove(index);
    }

    public Item getItem(int index) {
        return itemList.get(index);
    }

    /**
     * Gets the number of items in the system.
     *
     * @return the size of item list
     */
    public int getSize() {
        return itemList.size();
    }

    /**
     * Clears all items in the system.
     */
    public void clearItemList() {
        itemList.clear();
    }
}

