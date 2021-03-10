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

    public void deleteItem(int index) {
        itemList.remove(index);
    }
}
