package seedu.easylog.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import seedu.easylog.model.Item;
import seedu.easylog.model.Order;

import java.math.BigDecimal;
import java.util.ArrayList;


public class OrderTest {

    @Test
    public void getAddOrderMessageTest() {
        ArrayList<Item> itemList = new ArrayList<>();
        ArrayList<Integer> itemStockList = new ArrayList<>();
        itemList.add(new Item("milk", new BigDecimal("5.6"), Integer.parseInt("20")));
        itemList.add(new Item("tea", new BigDecimal("3.4"), Integer.parseInt("20")));
        itemList.add(new Item("milk tea", new BigDecimal("9.0"), Integer.parseInt("20")));
        itemStockList.add(Integer.parseInt("1"));
        itemStockList.add(Integer.parseInt("2"));
        itemStockList.add(Integer.parseInt("3"));
        String customerName = "Coco";
        assertEquals("Got it! The order for customer [Coco] is added.",
                new Order(customerName, itemList, itemStockList).getAddOrderMessage());
    }

    @Test
    public void getCustomerNameTest() {
        Item itemOne = new Item("milk", new BigDecimal("5.6"), Integer.parseInt("20"));
        Item itemTwo = new Item("tea", new BigDecimal("3.4"), Integer.parseInt("20"));
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(itemOne);
        itemList.add(itemTwo);
        ArrayList<Integer> itemStockList = new ArrayList<>();
        itemStockList.add(Integer.parseInt("1"));
        itemStockList.add(Integer.parseInt("2"));
        Order order = new Order("Coco", itemList, itemStockList);
        String customerName = "Coco";
        assertEquals(customerName, order.getCustomerName());
    }

    @Test
    public void getItemsInOrderTest() {
        Item itemOne = new Item("milk", new BigDecimal("5.6"), Integer.parseInt("20"));
        Item itemTwo = new Item("tea", new BigDecimal("3.4"), Integer.parseInt("20"));
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(itemOne);
        itemList.add(itemTwo);
        ArrayList<Integer> itemStockList = new ArrayList<>();
        itemStockList.add(Integer.parseInt("1"));
        itemStockList.add(Integer.parseInt("2"));
        Order order = new Order("Coco", itemList, itemStockList);
        assertEquals(itemList, order.getItemsInOrder());
    }

}
