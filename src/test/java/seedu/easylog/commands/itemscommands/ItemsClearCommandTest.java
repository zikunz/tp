package seedu.easylog.commands.itemscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;

import static org.junit.jupiter.api.Assertions.assertSame;

class ItemsClearCommandTest {
    @Test
    @DisplayName("(All Items) Should Be Cleared Correctly")
    public void itemsClearCommand_shouldBeClearedCorrectly() {
        ItemManager itemManager = new ItemManager();
        // 0 item
        assertSame(0, itemManager.getSize());

        // 1 item
        Item firstItem = new Item("CS2113T Textbook");
        assertSame(0, itemManager.getSize());

        // multiple items
        Item secondItem = new Item("CS2113T Textbook");
        Item thirdItem = new Item("Logitech BRIO Webcam");
        Item fourthItem = new Item("Lenovo China-exclusive Legion R9000X");
        assertSame(0, itemManager.getSize());
    }
}