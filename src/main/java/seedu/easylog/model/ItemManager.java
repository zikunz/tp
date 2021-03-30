
package seedu.easylog.model;

import seedu.easylog.common.Messages;
import seedu.easylog.common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Manage item list manipulation commands.
 */
public class ItemManager {

    protected ArrayList<Item> itemList;

    protected ArrayList<Item> foundList = new ArrayList<>();

    protected ArrayList<String> itemDescriptionRecord = new ArrayList<>();

    public ItemManager() {
        this.itemList = new ArrayList<>();
    }

    /**
     * Adds item to the item list.
     * @param item item to be added to the item list
     */
    public void addItem(Item item) {
        itemList.add(item);
        itemDescriptionRecord.add(item.getItemName());
    }

    /**
     * Gets the item list.
     *
     * @return The list of items in the system
     */
    public ArrayList<Item> getItemList() {
        return itemList;
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
     * Gets the list of items in String format to be printed as output to the user.
     *
     * @return String format for the list of relevant items to be printed
     */
    public String getFoundListPrintFormat(ArrayList<Item> itemListToBePrint) {
        String foundListOutput = "";
        for (int itemIndex = 0; itemIndex < itemListToBePrint.size(); itemIndex++) {
            foundListOutput += (itemIndex + 1) + ". " + itemListToBePrint.get(itemIndex).getItemName()
                    + Constants.ITEM_NAME_AND_PRICE_SEPARATOR
                    + itemListToBePrint.get(itemIndex).getItemPrice() + Constants.ITEM_PRICE_AND_STOCK_SEPARATOR
                    + itemListToBePrint.get(itemIndex).getItemStock() + "\n";
        }
        return foundListOutput;
    }

    /**
     * Removes a specific item from the system.
     */
    public void deleteItem(int index) {
        itemList.remove(index);
        itemDescriptionRecord.remove(index);
    }

    /**
     * Finds items by keyword.
     *
     * @param keyword keyword to be searched
     */
    public void findItem(String keyword) {
        for (int i = 0; i < getSize(); i++) {
            if (getItem(i).itemName.contains(keyword)) {
                foundList.add(getItem(i));
            }
        }
    }

    /**
     * get index of the item name in the inventory.
     *
     * @param itemName name of the item to get it's index.
     * @return index of the corresponding item name in the inventory.
     */
    public int getItemIndex(String itemName) {
        int itemIndex = 0;
        for (int i = 0; i < getSize(); ++i) {
            if (getItem(i).itemName.contains(itemName)) {
                itemIndex = i;
                break;
            }
        }
        return itemIndex;
    }

    /**
     * Gets the found items.
     *
     * @return list of found item(s) from itemList
     */
    public ArrayList<Item> getFoundList() {
        return foundList;
    }

    /**
     * Gets the number of relevant items after search.
     *
     * @return the size of foundList
     */
    public int foundSize() {
        return foundList.size();
    }

    /**
     * Gets the description of a specific item based on the given index.
     *
     * @return the description of the specific item
     */
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
        itemDescriptionRecord.clear();
    }

    /**
     * Clears all found items in Found List.
     */
    public void clearFoundList() {
        foundList.clear();
    }

    /**
     * Gets the latest item added to the itemList.
     *
     * @return Latest item added to itemList
     */
    public Item getLatestItemAdded() {
        int index = getSize() - Constants.ARRAY_OFFSET;
        return getItem(index);
    }

    /**
     * Sets the price of an item specified by its index to
     * be the revised one.
     */
    public void setRevisedItemPrice(int itemIndex, BigDecimal revisedItemPrice) {
        Item itemToBeUpdated = getItem(itemIndex);
        itemToBeUpdated.setItemPrice(revisedItemPrice);
    }

    /**
     * Sets the stock of an item specified by its index to
     * be the revised one.
     */
    public void setRevisedItemStock(int itemIndex, int revisedItemStock) {
        Item itemToBeUpdated = getItem(itemIndex);
        itemToBeUpdated.setItemStock(revisedItemStock);
    }

    /**
     * Gets the item stock of a particular item.
     *
     * @param item item of interest
     * @return the current stock of the specified item
     */
    public int getItemStock(Item item) {
        return item.getItemStock();
    }

    /**
     * Checks if the item exist in the item list.
     * @param itemName the item to be checked
     * @return the existence of item in the item list
     */
    public boolean checkRepeatItem(String itemName) {
        for (Item item : itemList) {
            if (item.itemName.equals(itemName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the item descriptions from the item list.
     * @return the descriptions of items form the item list
     */
    public ArrayList<String> getItemDescriptionRecord() {
        return itemDescriptionRecord;
    }
}

