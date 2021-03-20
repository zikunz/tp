package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.InvalidItemStockException;
import java.util.regex.Pattern;

public class ItemsPromptStockCommand extends ItemsCommand {
    /**
     * Prompts the user for the item stock.
     *
     * @return item stock
     */

    public String execute() throws NullItemStockException, EmptyItemStockException,
            NonIntegerNumericItemStockException, InvalidItemStockException {
        ui.promptItemStock();
        String stockInString = Constants.SCANNER.nextLine();

        if (stockInString == null) {
            throw new NullItemStockException();
        }

        String priceInStringWithoutSpace = stockInString.replace(" ", "");
        if (priceInStringWithoutSpace.isEmpty()) {
            throw new EmptyItemStockException();
        }

        Pattern pattern = Pattern.compile(Constants.REGEX_INT_NUMERIC_INPUT);
        if (!pattern.matcher(stockInString).matches()) {
            throw new NonIntegerNumericItemStockException();
        }

        int stockInInt = Integer.parseInt(stockInString);
        if (stockInInt < Constants.MINIMUM_ITEM_STOCK || stockInInt > Constants.MAXIMUM_ITEM_STOCK) {
            throw new InvalidItemStockException();
        }

        return stockInString;


    }
}
