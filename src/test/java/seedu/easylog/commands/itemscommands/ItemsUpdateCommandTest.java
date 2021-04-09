package seedu.easylog.commands.itemscommands;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemsUpdateCommandTest {
    @Test
    @DisplayName("Items Should Be Updated Correctly")
    public void itemsUpdateCommand_shouldBeUpdatedCorrectly() {
        ItemsUpdateCommand itemsUpdateCommand = new ItemsUpdateCommand();
        ItemManager itemManager = new ItemManager();

        // Calling items update command when the item list is empty
        EmptyItemListException emptyItemListException = assertThrows(EmptyItemListException.class, () -> {
            itemsUpdateCommand.execute("", itemManager);
        });


        // Wrong items update command
        Item firstItem = new Item("CS2113T Textbook", BigDecimal.valueOf(50), 10);
        itemManager.addItem(firstItem);
        WrongUpdateCommandException wrongUpdateCommandException = assertThrows(WrongUpdateCommandException.class, () -> {
            itemsUpdateCommand.execute(" CS2113T Textbook", itemManager);
        });
        wrongUpdateCommandException = assertThrows(WrongUpdateCommandException.class, () -> {
            itemsUpdateCommand.execute(" ", itemManager);
        });
        wrongUpdateCommandException = assertThrows(WrongUpdateCommandException.class, () -> {
            itemsUpdateCommand.execute("items", itemManager);
        });
    }
}
