package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;

import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;

import seedu.easylog.model.ItemManager;

public class ItemsUpdateCommand extends ItemsCommand {
    /**
     * Updates a particular field of an item of interest in the system.
     *
     * @param extraDescription Any extra input from the user, this field should be empty
     *                         in order to execute an update command successfully
     * @param itemManager      item manager object which modifies items when necessary
     */
    public void execute(String extraDescription, ItemManager itemManager) throws WrongUpdateCommandException,
            WrongItemFieldException, EmptyItemIndexException, InvalidItemIndexException, EmptyItemPriceException,
            InvalidItemPriceException, NullItemPriceException, NullItemStockException, EmptyItemStockException,
            InvalidItemStockException, NonIntegerNumericItemStockException, NonNumericItemPriceException {
        if (!extraDescription.isEmpty()) {
            throw new WrongUpdateCommandException();
        }

        ui.askForItemIndex();
        ItemsListCommand itemsListCommand = new ItemsListCommand();
        itemsListCommand.execute(itemManager); // Show item list to allow user to see the item index to update

        String itemIndexInString = ui.askForUserInput();
        if (itemIndexInString.equals("")) {
            throw new EmptyItemIndexException();
        }
        int itemIndex = Integer.parseInt(itemIndexInString) - Constants.ARRAY_OFFSET;
        int size = itemManager.getSize();
        if (itemIndex < 0 || itemIndex >= size) {
            throw new InvalidItemIndexException();
        }

        ui.askForItemFieldToBeUpdated();
        String itemField = ui.askForUserInput();
        itemsParser.processUpdateAttributeInput(itemField, itemIndex, itemManager);
    }
}
