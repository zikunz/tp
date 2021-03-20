package seedu.easylog.commands.itemscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

public class ItemsPromptPriceCommand extends ItemsCommand {
    /**
     * Prompts the user for the item price.
     *
     * @return item price
     */
    public String execute() throws NullItemPriceException, EmptyItemPriceException, InvalidItemPriceException,
            NonNumericItemPriceException {
        ui.promptItemPrice();
        String priceInString = Constants.SCANNER.nextLine();

        if (priceInString == null) {
            throw new NullItemPriceException();
        }

        String priceInStringWithoutSpace = priceInString.replace(" ", "");
        if (priceInStringWithoutSpace.isEmpty()) {
            throw new EmptyItemPriceException();
        }

        Pattern pattern = Pattern.compile(Constants.REGEX_NUMERIC_INPUT);
        if (!pattern.matcher(priceInString).matches()) { // If priceInString is not numeric
            throw new NonNumericItemPriceException();
        }

        double priceInDouble = Double.parseDouble(priceInString);

        if (priceInDouble < Constants.MINIMUM_ITEM_PRICE || priceInDouble > Constants.MAXIMUM_ITEM_PRICE) {
            throw new InvalidItemPriceException();
        }

        // Float and double are not suitable for monetary calculations
        // due to loss of significance. Hence, BigDecimal is used
        BigDecimal bigDecimal = new BigDecimal(priceInString);

        // Set the maximum scale of the item price to be 2
        bigDecimal = bigDecimal.setScale(Constants.PRICING_SCALE, RoundingMode.HALF_EVEN);

        // Remove all trailing zero(s) of the item price, if any
        priceInString = bigDecimal.stripTrailingZeros().toPlainString();

        return priceInString;
    }
}
