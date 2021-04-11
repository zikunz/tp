//package seedu.easylog.commands.itemscommands;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import seedu.easylog.exceptions.ItemListAlreadyClearedException;
//import seedu.easylog.model.Item;
//import seedu.easylog.model.ItemManager;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//class ItemsClearCommandTest {
//    @Test
//    @DisplayName("(If Any, All Item(s)) Should Be Cleared Correctly")
//    public void itemsClearCommand_shouldBeClearedCorrectly() throws ItemListAlreadyClearedException {
//        ItemsClearCommand itemsClearCommand = new ItemsClearCommand();
//        ItemManager itemManager = new ItemManager();
//
//        // No item to clear
//        ItemListAlreadyClearedException itemListAlreadyClearedException =
//                assertThrows(ItemListAlreadyClearedException.class, () -> {
//                    itemsClearCommand.execute(itemManager);
//                });
//
//        // 1 item to clear
//        Item firstItem = new Item("CS2113T Textbook", BigDecimal.valueOf(50), 10);
//        itemManager.addItem(firstItem);
//        itemsClearCommand.execute(itemManager);
//        assertSame(0, itemManager.getSize());
//
//        // multiple items to clear
//        Item secondItem = new Item("CS2113T Textbook", BigDecimal.valueOf(50), 10);
//        Item thirdItem = new Item("Logitech BRIO Webcam", BigDecimal.valueOf(300), 5);
//        Item fourthItem = new Item("Lenovo China-exclusive Legion R9000X", BigDecimal.valueOf(2000),
//                2);
//        Item fifthItem = new Item("Guy's Perfume", BigDecimal.valueOf(100), 20);
//        itemManager.addItem(secondItem);
//        itemManager.addItem(thirdItem);
//        itemManager.addItem(fourthItem);
//        itemManager.addItem(fifthItem);
//        itemsClearCommand.execute(itemManager);
//        assertSame(0, itemManager.getSize());
//    }
//}