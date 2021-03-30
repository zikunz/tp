package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NonNumericItemPriceException;

import java.math.BigDecimal;

public class ItemsPromptPriceCommand extends ItemsCommand {
    /**
     * Prompts the user for the item price.
     *
     * @return item price
     */
    public BigDecimal execute() throws NullItemPriceException, EmptyItemPriceException, InvalidItemPriceException,
            NonNumericItemPriceException {
        ui.promptItemPrice();
        String priceInString = Constants.SCANNER.nextLine();
        try {
            Integer.parseInt(priceInString);
        } catch (NumberFormatException e) {
            throw new NonNumericItemPriceException();
        }
        if (priceInString == null) {
            throw new NullItemPriceException();
        }
        if (priceInString.equals("")) {
            throw new EmptyItemPriceException();
        }
        BigDecimal price = itemsParser.processPriceInput(priceInString);
        Double priceInDouble = price.doubleValue();
        if (priceInDouble < Constants.MINIMUM_ITEM_PRICE || priceInDouble > Constants.MAXIMUM_ITEM_PRICE) {
            throw new InvalidItemPriceException();
        }
        return price;
    }
}
