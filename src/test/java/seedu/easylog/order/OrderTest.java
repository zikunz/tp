package seedu.easylog.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;
import java.util.ArrayList;


public class OrderTest {

    @Test
    public void getAddOrderMessageTest() {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("ps5"));
        itemList.add(new Item("water"));
        String customerName = "weisheng";
        assertEquals("Got it! The order for customer [weisheng] is added.",
                new Order(customerName, itemList).getAddOrderMessage());
    }

    @Test
    public void getCustomerNameTest() {
        Item item_one = new Item("bag");
        Item item_two = new Item("earphone");
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item_one);
        itemList.add(item_two);
        Order order = new Order("Coco", itemList);
        String customerName = "Coco";
        assertEquals(customerName, order.getCustomerName());
    }

    @Test
    public void getItemsInOrderTest() {
        Item item_one = new Item("milk");
        Item item_two = new Item("tea");
        Item item_three = new Item("milk tea");
        ArrayList<Item> itemList =  new ArrayList<>();
        itemList.add(item_one);
        itemList.add(item_two);
        Order order = new Order("Coco", itemList);
        assertEquals(itemList, order.getItemsInOrder());
    }
}
