package seedu.easylog.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import java.util.ArrayList;

public class OrdersParserTest {

    @Test
    public void processItemsAddedToOrderTest() {
        final OrdersParser ordersParser = new OrdersParser();
        ItemManager itemManager = new ItemManager();

        ArrayList<Item> itemsTestList = new ArrayList<>();
        Item testItem1 = new Item("PS5");
        Item testItem2 = new Item("Keyboard");
        itemsTestList.add(testItem1);
        itemsTestList.add(testItem2);
        itemManager.addItem(testItem1);
        itemManager.addItem(testItem2);
        assertEquals(itemsTestList.get(0), ordersParser.processItemsAddedToOrder("1 2").get(0));
        assertEquals(itemsTestList.get(1), ordersParser.processItemsAddedToOrder("1 2").get(1));
    }
}