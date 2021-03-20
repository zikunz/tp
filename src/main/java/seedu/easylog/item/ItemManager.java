
package seedu.easylog.item;

import seedu.easylog.common.Messages;
import seedu.easylog.common.Constants;

import java.util.ArrayList;

/**
 * Manage item list manipulation commands.
 */
public class ItemManager {

    private static final ArrayList<Item> ITEM_LIST = new ArrayList<>();

    public void addItem(Item item) {
        ITEM_LIST.add(item);
    }

    /**
     * Gets the item list.
     *
     * @return The list of items in the system
     */
    public ArrayList<Item> getItemList() {
        return ITEM_LIST;
    }

    /**
     * Gets the list of items in String format to be printed as output to the user.
     * Indentation is added if this method is called to help print the list of orders.
     * No indentation is added if this method is called when only printing the list of items.
     *
     * @return String format for the list of items to be printed
     */
    public String getItemListPrintFormat(ArrayList<Item> itemListToBePrint, boolean shouldIncludeIndentation) {
        String itemsListOutput = "";

        if (shouldIncludeIndentation) {
            for (int itemIndex = 0; itemIndex < itemListToBePrint.size(); itemIndex++) {
                itemsListOutput += Messages.MESSAGE_INDENTATION + (itemIndex + 1) + ". "
                        + itemListToBePrint.get(itemIndex).getItemName() + Constants.ITEM_NAME_AND_PRICE_SEPARATOR
                        + itemListToBePrint.get(itemIndex).getItemPrice() + Constants.ITEM_PRICE_AND_STOCK_SEPARATOR
                        + itemListToBePrint.get(itemIndex).getItemStock() + "\n";
            }
        } else {
            for (int itemIndex = 0; itemIndex < itemListToBePrint.size(); itemIndex++) {
                itemsListOutput += (itemIndex + 1) + ". " + itemListToBePrint.get(itemIndex).getItemName()
                        + Constants.ITEM_NAME_AND_PRICE_SEPARATOR
                        + itemListToBePrint.get(itemIndex).getItemPrice() + Constants.ITEM_PRICE_AND_STOCK_SEPARATOR
                        + itemListToBePrint.get(itemIndex).getItemStock() + "\n";
            }
        }
        return itemsListOutput;
    }

    /**
     * Removes a specific item from the system.
     */
    public void deleteItem(int index) {
        ITEM_LIST.remove(index);
    }

    /**
     * Gets the description of a specific item based on the given index.
     *
     * @return the description of the specific item
     */
    public Item getItem(int index) {
        return ITEM_LIST.get(index);
    }

    /**
     * Gets the number of items in the system.
     *
     * @return the size of item list
     */
    public int getSize() {
        return ITEM_LIST.size();
    }

    /**
     * Clears all items in the system.
     */
    public void clearItemList() {
        ITEM_LIST.clear();
    }

    /**
     * Gets the latest item added to the ITEM_LIST.
     *
     * @return Latest item added to ITEM_LIST
     */
    public Item getLatestItemAdded() {
        int index = getSize() - Constants.ARRAY_OFFSET;
        return getItem(index);
    }

    /**
     * Sets the price of an item specified by its index to
     * be the revised one.
     */
    public void setRevisedItemPrice(int itemIndex, String revisedItemPrice) {
        Item itemToBeUpdated = getItem(itemIndex);
        itemToBeUpdated.setItemPrice(revisedItemPrice);
    }
}

