package seedu.easylog.item;

import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest {

    @Test
    public void testGetItemName() {
        assertEquals("PS5", new Item("PS5").getItemName());
    }

}
