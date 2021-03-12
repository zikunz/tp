package seedu.easylog.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemManagerTest {

    @Test
    public void testGetItemListPrintFormat() {
        Item itemOne = new Item("PS5");
        Item itemTwo = new Item("MP3");
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(itemOne);
        itemManager.addItem(itemTwo);

        assertEquals("1. PS5\n2. MP3\n", itemManager.getItemListPrintFormat(itemManager.getItemList()));
    }
}
