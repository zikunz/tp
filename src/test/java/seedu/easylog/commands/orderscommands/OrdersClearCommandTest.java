package seedu.easylog.commands.orderscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;
import seedu.easylog.parser.OrdersParser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrdersClearCommandTest {
    @Test
    @DisplayName("(If Any, All Orders) Should Be Cleared Correctly")
    public void ordersClearCommand_shouldBeClearedCorrectly() throws OrderListAlreadyClearedException {
        OrdersClearCommand ordersClearCommand = new OrdersClearCommand();
        OrderManager orderManager = new OrderManager();
        OrdersParser ordersParser = new OrdersParser();
        ItemManager itemManager = new ItemManager();

        // 0 item
        OrderListAlreadyClearedException exception;
        exception = assertThrows(OrderListAlreadyClearedException.class, () -> ordersClearCommand.execute());

        // 1 order
        String nameForZikun = "Zikun";
        Item firstItem = new Item("iPhone X charger");
        itemManager.addItem(firstItem);
        String itemIndexForZikun = "1";
        ArrayList<Item> itemForZikun = ordersParser.processItemsAddedToOrder(itemIndexForZikun);

        Order firstOrder = new Order(nameForZikun, itemForZikun);
        orderManager.addOrder(firstOrder);

        ordersClearCommand.execute();
        assertSame(0, orderManager.getSize());

        // multiple orders
        String nameForYiwen = "Yiwen";
        String nameForQixiong = "Qixiong";

        Item secondItem = new Item("Competitive Programming 3");
        Item thirdItem = new Item("Competitive Programming 4");

        itemManager.addItem(secondItem);
        itemManager.addItem(thirdItem);

        String itemIndexForYiwen = "2";
        String itemsIndexForQixiong = "3";

        ArrayList<Item> itemForYiwen = ordersParser.processItemsAddedToOrder(itemIndexForYiwen);
        ArrayList<Item> itemForQixiong = ordersParser.processItemsAddedToOrder(itemsIndexForQixiong);

        Order secondOrder = new Order(nameForYiwen, itemForYiwen);
        Order thirdOrder = new Order(nameForQixiong, itemForQixiong);

        orderManager.addOrder(secondOrder);
        orderManager.addOrder(thirdOrder);

        ordersClearCommand.execute();
        assertSame(0, orderManager.getSize());
    }
}