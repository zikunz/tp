//package seedu.easylog.commands.itemscommands;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import seedu.easylog.exceptions.ItemListAlreadyClearedException;
//import seedu.easylog.model.Item;
//import seedu.easylog.model.ItemManager;
//import seedu.easylog.ui.Ui;
//
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//class ItemsClearCommandTest {
//    @Test
//    @DisplayName("(If Any, All Items) Should Be Cleared Correctly")
//    public void itemsClearCommand_shouldBeClearedCorrectly() throws ItemListAlreadyClearedException {
//        ItemsClearCommand itemsClearCommand = new ItemsClearCommand();
//        ItemManager itemManager = new ItemManager();
//        Ui ui = new Ui();
//
//        // 1 item
//        Item firstItem = new Item("CS2113T Textbook");
//        itemManager.addItem(firstItem);
//        itemsClearCommand.execute(itemManager);
//        assertSame(0, itemManager.getSize());
//
//        // multiple items
//        Item secondItem = new Item("CS2113T Textbook");
//        Item thirdItem = new Item("Logitech BRIO Webcam");
//        Item fourthItem = new Item("Lenovo China-exclusive Legion R9000X");
//        itemManager.addItem(secondItem);
//        itemManager.addItem(thirdItem);
//        itemManager.addItem(fourthItem);
//        itemsClearCommand.execute(itemManager);
//        assertSame(0, itemManager.getSize());
//    }
//}