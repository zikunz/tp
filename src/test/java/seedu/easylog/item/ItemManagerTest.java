package seedu.easylog.item;

import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemManagerTest {

    @Test
    public void testGetItemList() {
        Item itemOne = new Item("PS5");
        Item itemTwo = new Item("MP3");
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(itemOne);
        itemManager.addItem(itemTwo);

        assertEquals("1. PS5\n2. MP3\n", new ItemManager().getItemList());
    }
}
