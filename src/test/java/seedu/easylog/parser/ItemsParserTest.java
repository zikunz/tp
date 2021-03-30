package seedu.easylog.parser;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemsParserTest {

    ItemsParser itemsParser = new ItemsParser();

    @Test
    public void processPriceInputTest() {
        String testInput = "599.00";
        assertEquals(new BigDecimal(testInput), itemsParser.processPriceInput(testInput));
    }

    @Test
    public void processStockInputTest() {
        String testInput = "10";
        assertEquals(10, itemsParser.processStockInput(testInput));
    }
}
