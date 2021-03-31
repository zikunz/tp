package seedu.easylog.item;

import org.junit.jupiter.api.Test;
import seedu.easylog.common.Messages;
import seedu.easylog.model.Item;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    Item testItem = new Item("PS5", new BigDecimal("599.00"), 10);

    @Test
    public void testGetItemName() {
        assertEquals("PS5", testItem.getItemName());
    }

    @Test
    public void testGetItemPrice() {
        assertEquals(new BigDecimal("599.00"), testItem.getItemPrice());
    }

    @Test
    public void testGetItemStock() {
        assertEquals(10, testItem.getItemStock());
    }

    @Test
    public void testGetAddItemMessage() {
        assertEquals("Got it! The item [PS5] is added.", testItem.getAddItemMessage());
    }

    @Test
    public void testGetDeletedItemMessage() {
        assertEquals(Messages.MESSAGE_LINE
                + "Got it! The item [PS5] is deleted.", testItem.getDeleteItemMessage());
    }

    @Test
    public void testSaveToFileFormat() {
        testItem.setItemSold(10);
        String expectedOutput = "PS5 599.00 10 10";
        assertEquals(expectedOutput, testItem.saveToFileFormat());
    }
}
