package seedu.easylog.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemManagerTest {

    @Test
    public void testGetItemListPrintFormat() {
        ItemManager itemManager = new ItemManager();

        assertEquals("1. PS5\n2. keyboard\n", itemManager.getItemListPrintFormat(itemManager.getItemList()));
    }
}
