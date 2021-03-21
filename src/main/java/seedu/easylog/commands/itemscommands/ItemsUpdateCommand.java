package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;

import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.NonIntegerNumericItemIndexException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;


import seedu.easylog.item.ItemManager;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class ItemsUpdateCommand extends ItemsCommand {
    /**
     * Updates a particular field of an item of interest in the system.
     *
     * @param extraDescription Any extra input from the user, this field should be empty
     *                         in order to execute an update command successfully
     * @param itemManager      item manager object which modifies items when necessary
     */
    public void execute(String extraDescription, ItemManager itemManager) throws WrongUpdateCommandException,
            WrongItemFieldException, EmptyItemIndexException, NonIntegerNumericItemIndexException,
            InvalidItemIndexException, NonNumericItemPriceException, EmptyItemPriceException, InvalidItemPriceException,
            NullItemPriceException, NullItemStockException, EmptyItemStockException,
            NonIntegerNumericItemStockException, InvalidItemStockException {
        if (!extraDescription.isEmpty()) {
            throw new WrongUpdateCommandException();
        }

        ui.askForItemIndex();
        ItemsListCommand itemsListCommand = new ItemsListCommand();
        itemsListCommand.execute(itemManager); // Show item list

        String itemIndexInString = Constants.SCANNER.nextLine();
        String itemIndexInStringWithoutSpaces = itemIndexInString.replace(" ", "");
        if (itemIndexInStringWithoutSpaces.isEmpty()) {
            throw new EmptyItemIndexException();
        }

        Pattern pattern = Pattern.compile(Constants.REGEX_INT_NUMERIC_INPUT);
        if (!pattern.matcher(itemIndexInString).matches()) { // If itemIndexInString is not integer numeric
            throw new NonIntegerNumericItemIndexException();
        }

        int itemIndexInInt = Integer.parseInt(itemIndexInString) - Constants.ARRAY_OFFSET;

        int size = itemManager.getSize();
        if (itemIndexInInt < 0 || itemIndexInInt >= size) {
            throw new InvalidItemIndexException();
        }

        ui.askForItemFieldToBeUpdated();
        String itemField = Constants.SCANNER.nextLine();

        BigDecimal revisedItemPrice;
        int revisedItemStock;

        if (itemField.equals("p")) {
            ui.askForRevisedItemPrice();
            ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();

            // Get revised item price while handling all possible exceptions
            revisedItemPrice = itemsPromptPriceCommand.execute();
            itemManager.setRevisedItemPrice(itemIndexInInt, revisedItemPrice);
            ui.showUpdateItemPrice();
        } else if (itemField.equals("s")) {
            ui.askForRevisedItemStock();
            ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();

            // Get revised item stock while handling all possible exceptions
            revisedItemStock = itemsPromptStockCommand.execute();
            itemManager.setRevisedItemStock(itemIndexInInt, revisedItemStock);
            ui.showUpdateItemStock();
        } else {
            throw new WrongItemFieldException();
        }
    }
}
