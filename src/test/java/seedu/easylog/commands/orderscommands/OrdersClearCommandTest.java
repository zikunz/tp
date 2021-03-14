package seedu.easylog.commands.orderscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;
import seedu.easylog.order.OrderManager;

import static org.junit.jupiter.api.Assertions.assertSame;

class OrdersClearCommandTest {
    @Test
    @DisplayName("(All Orders) Should Be Cleared Correctly")
    public void ordersClearCommand_shouldBeClearedCorrectly() {
        OrderManager orderManager = new OrderManager();
        // 0 item
        assertSame(0, orderManager.getSize());

        // 1 item
        Item firstItem = new Item
                ("Competitive Programming 4: The Lower Bound of Programming Contests in the 2020s");
        assertSame(0, orderManager.getSize());

        // multiple items
        Item secondItem = new Item("CS2113T Textbook");
        Item thirdItem = new Item("iPhone 12 Pro Pacific Blue 256GB");
        Item fourthItem = new Item("Apple AirPods Pro");
        assertSame(0, orderManager.getSize());
    }
}