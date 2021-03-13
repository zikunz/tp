
package seedu.easylog.item;

import seedu.easylog.common.Messages;

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
     * Gets the list of items in String format to be printed as output to the user.
     * Indentation is added if this method is called to help print the list of orders.
     * No indentation is added if this method is called when only printing the list of items.
     *
     * @return String format for the list of items to be printed.
     */
    public String getItemListPrintFormat(ArrayList<Item> itemListToBePrinted, boolean shouldIncludeIndentation) {
        int taskCount = 1;
        String itemsListOutput = "";

        if (shouldIncludeIndentation) {
            for (Item item : itemListToBePrinted) {
                itemsListOutput += Messages.MESSAGE_INDENTATION + taskCount + ". " + item.getItemName() + "\n";
                ++taskCount;
            }
        } else {
            for (Item item : itemListToBePrinted) {
                itemsListOutput += taskCount + ". " + item.getItemName() + "\n";
                ++taskCount;
            }
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

