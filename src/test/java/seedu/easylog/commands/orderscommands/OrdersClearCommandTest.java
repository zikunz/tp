//package seedu.easylog.commands.orderscommands;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import seedu.easylog.exceptions.OrderListAlreadyClearedException;
//import seedu.easylog.item.Item;
//import seedu.easylog.item.ItemManager;
//import seedu.easylog.order.Order;
//import seedu.easylog.order.OrderManager;
//import seedu.easylog.parser.OrdersParser;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//class OrdersClearCommandTest {
//    @Test
//    @DisplayName("(If Any, All Orders) Should Be Cleared Correctly")
//    public void ordersClearCommand_shouldBeClearedCorrectly() throws OrderListAlreadyClearedException {
//        OrdersClearCommand ordersClearCommand = new OrdersClearCommand();
//        OrderManager secondOrderManager = new OrderManager();
//        OrdersParser ordersParser = new OrdersParser();
//        ItemManager itemManager = new ItemManager();
//
//        // 1 order
//        String nameForKexuan = "Kexuan";
//        Item firstItem = new Item("iPhone X charger");
//        itemManager.addItem(firstItem);
//        String itemIndexForKexuan = "1";
//        ArrayList<Item> itemForKexuan = ordersParser.processItemsAddedToOrder(itemIndexForKexuan, itemManager);
//
//        Order firstOrder = new Order(nameForKexuan, itemForKexuan);
//        secondOrderManager.addOrder(firstOrder);
//
//        ordersClearCommand.execute(secondOrderManager);
//        assertSame(0, secondOrderManager.getSize());
//
//        // multiple orders
//        String nameForYiwen = "Yiwen";
//        String nameForQixiong = "Qixiong";
//
//        Item secondItem = new Item("Competitive Programming 3");
//        Item thirdItem = new Item("Competitive Programming 4");
//
//        itemManager.addItem(secondItem);
//        itemManager.addItem(thirdItem);
//
//        String itemIndexForYiwen = "2";
//        String itemsIndexForQixiong = "3";
//
//        ArrayList<Item> itemForYiwen = ordersParser.processItemsAddedToOrder(itemIndexForYiwen, itemManager);
//        ArrayList<Item> itemForQixiong = ordersParser.processItemsAddedToOrder(itemsIndexForQixiong, itemManager);
//
//        Order secondOrder = new Order(nameForYiwen, itemForYiwen);
//        Order thirdOrder = new Order(nameForQixiong, itemForQixiong);
//
//        secondOrderManager.addOrder(secondOrder);
//        secondOrderManager.addOrder(thirdOrder);
//
//        ordersClearCommand.execute(secondOrderManager);
//        assertSame(0, secondOrderManager.getSize());
//    }
//}