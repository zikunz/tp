
package seedu.easylog.item;

import seedu.easylog.common.Messages;
import seedu.easylog.common.Constants;

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
    public String getItemListPrintFormat(ArrayList<Item> itemListToBePrint, boolean shouldIncludeIndentation) {
        String itemsListOutput = "";

        if (shouldIncludeIndentation) {
            for (int itemIndex = 0; itemIndex < itemListToBePrint.size(); itemIndex++) {
                itemsListOutput += Messages.MESSAGE_INDENTATION + (itemIndex + 1) + ". "
                        + itemListToBePrint.get(itemIndex).getItemName() + "\n";
            }
        } else {
            for (int itemIndex = 0; itemIndex < itemListToBePrint.size(); itemIndex++) {
                itemsListOutput += (itemIndex + 1) + ". " + itemListToBePrint.get(itemIndex).getItemName() + "\n";
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

    /**
     * Get the latest item added to the itemList.
     * @return Latest item added to itemList.
     */
    public Item getLatestItemAdded() {
        int index = getSize() - Constants.ARRAY_OFFSET;
        return getItem(index);
    }
}

