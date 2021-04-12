package seedu.easylog.parser;

import org.junit.jupiter.api.Test;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemsParserTest {

    ItemsParser itemsParser = new ItemsParser();

    @Test
    public void processPriceInputTest() throws NonNumericItemPriceException, EmptyItemPriceException,
            InvalidItemPriceException, NullItemPriceException {
        String testInput = "599.00";
        assertEquals(new BigDecimal(testInput), itemsParser.itemPriceInStringToBigDecimalFormat(testInput));
    }

    @Test
    public void processStockInputTest() {
        String testInput = "10";
        assertEquals(10, itemsParser.processStockInput(testInput));
    }
}
