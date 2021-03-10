package seedu.easylog.item;

import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemManagerTest {

    @Test
    public void testGetItemList() {
        new ItemManager();
        assertEquals("", new ItemManager().getItemList());
    }

}
