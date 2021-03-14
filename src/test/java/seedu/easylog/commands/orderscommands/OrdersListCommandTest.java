package seedu.easylog.commands.orderscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;
import seedu.easylog.parser.OrdersParser;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OrdersListCommandTest {
    @Test
    @DisplayName("(All Orders) Should Have Correct Attributes After the List Operation")
    public void ordersListCommand_shouldHaveCorrectAttributesAfterListOperation() {
        // Add three items in an order which belongs to Zikun
        Item firstItem = new Item("Spider-Man slippers");
        Item secondItem = new Item("Yeezy Boost 350 V2 44");
        Item thirdItem = new Item("LED bulb (warm white)");
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(firstItem);
        itemManager.addItem(secondItem);
        itemManager.addItem(thirdItem);

        String itemsAdded = "";
        String emptySpace = " ";
        String firstItemIndex = "1";
        String secondItemIndex = "2";
        String thirdItemIndex = "3";
        itemsAdded = firstItemIndex + emptySpace + secondItemIndex + emptySpace + thirdItemIndex;

        OrdersParser ordersParser = new OrdersParser();
        ArrayList<Item> itemsInOrder = ordersParser.processItemsAddedToOrder(itemsAdded);

        String customerName = "Zikun";
        Order order = new Order(customerName, itemsInOrder);
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(order);

        OrdersListCommand ordersListCommand = new OrdersListCommand();
        ordersListCommand.execute();

        // Test if there is only 1 order (for Zikun only)
        assertSame(1, orderManager.getSize());

        // Test of order object is not null (in other words, the order object is created successfully)
        assertNotNull(order);

        // Test if the order's customer name is Zikun
        assertEquals("Zikun", orderManager.getCustomerName(0));

        // Test if the items are stored correctly in the ArrayList
        ArrayList<Item> itemsToBeCheckedArrayList = itemManager.getItemList();
        Object[] itemsToBeCheckedArray =
                itemsToBeCheckedArrayList.toArray(); // Conversion from an ArrayList to an array

        assertArrayEquals(new Item[]{firstItem, secondItem, thirdItem},
                itemsToBeCheckedArray);
    }
}