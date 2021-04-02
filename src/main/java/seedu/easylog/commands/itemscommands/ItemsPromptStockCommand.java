package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;

public class ItemsPromptStockCommand extends ItemsCommand {
    /**
     * Prompts the user for the item stock.
     *
     * @return item stock
     */
    public int execute(boolean itemAlreadyExists) throws NullItemStockException, EmptyItemStockException,
            InvalidItemStockException, NonIntegerNumericItemStockException {
        if (itemAlreadyExists) {
            ui.promptAdditionalItemStock();
        } else {
            ui.promptItemStock();
        }

        String stockInString = ui.askForUserInput();

        try {
            Integer.parseInt(stockInString);
        } catch (NumberFormatException e) {
            throw new NonIntegerNumericItemStockException();
        }
        if (stockInString == null) {
            throw new NullItemStockException();
        }
        if (stockInString.equals("")) {
            throw new EmptyItemStockException();
        }
        int stock = itemsParser.processStockInput(stockInString);
        if (stock < Constants.MINIMUM_ITEM_STOCK || stock > Constants.MAXIMUM_ITEM_STOCK) {
            throw new InvalidItemStockException();
        }
        return stock;
    }
}
