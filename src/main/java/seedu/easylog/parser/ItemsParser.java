package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsClearCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.commands.itemscommands.ItemsFindCommand;
import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptPriceCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptStockCommand;
import seedu.easylog.commands.itemscommands.ItemsTipsCommand;
import seedu.easylog.commands.itemscommands.ItemsUpdateCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.InvalidTotalItemStockException;
import seedu.easylog.exceptions.ItemListAlreadyClearedException;
import seedu.easylog.exceptions.ItemNotFoundException;
import seedu.easylog.exceptions.NoItemsTipsCanBeGivenException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.model.ItemManager;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Process items command input.
 */
public class ItemsParser extends Parser {
    public static void processItemsInput(String itemsInput, ItemManager itemManager) throws
            NoItemsTipsCanBeGivenException {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsInput);
        String itemsType = splitItemsArg[0];
        String itemsArg = splitItemsArg[1];
        ArrayList<String> itemDescriptionRecord = itemManager.getItemDescriptionRecord();

        switch (itemsType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(itemsArg, itemManager, itemDescriptionRecord);
            } catch (EmptyNameException e) {
                ui.showItemEmptyName();
            } catch (InvalidItemPriceException e) {
                ui.showInvalidItemPrice();
            } catch (EmptyItemPriceException e) {
                ui.showEmptyItemPrice();
            } catch (NullItemPriceException e) {
                ui.showNullItemPrice();
            } catch (NonIntegerNumericItemStockException | NonNumericItemPriceException e) {
                ui.showNonNumericInputForAdd();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
            } catch (InvalidTotalItemStockException e) {
                ui.showInvalidTotalItemStock();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new ItemsDeleteCommand().execute(itemsArg, itemManager);
            } catch (EmptyNumberException e) {
                ui.showItemEmptyNumber();
            } catch (InvalidNumberException e) {
                ui.showInvalidItemNumber();
            } catch (NumberFormatException e) {
                ui.showNonIntegerItemNumber();
            }
            break;
        case (Constants.COMMAND_LIST):
            new ItemsListCommand().execute(itemManager);
            break;
        case (Constants.COMMAND_CLEAR):
            try {
                new ItemsClearCommand().execute(itemManager);
            } catch (ItemListAlreadyClearedException e) {
                ui.showAlreadyClearedItemList();
            }
            break;
        case (Constants.COMMAND_UPDATE):
            try {
                new ItemsUpdateCommand().execute(itemsArg, itemManager);
            } catch (WrongUpdateCommandException e) {
                ui.showWrongUpdateCommand();
            } catch (WrongItemFieldException e) {
                ui.showWrongItemField();
            } catch (InvalidItemIndexException e) {
                ui.showInvalidItemIndex();
            } catch (EmptyItemIndexException e) {
                ui.showEmptyItemIndex();
            } catch (EmptyItemPriceException e) {
                ui.showEmptyItemPrice();
            } catch (NullItemPriceException e) {
                ui.showNullItemPrice();
            } catch (NumberFormatException e) {
                ui.showNonNumericInputForUpdate();
            } catch (InvalidItemPriceException e) {
                ui.showInvalidItemPrice();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
            } catch (NonIntegerNumericItemStockException | NonNumericItemPriceException e) {
                ui.showNonNumericInputForAdd();
            }
            break;
        case (Constants.COMMAND_FIND):
            try {
                new ItemsFindCommand().execute(itemsArg, itemManager);
            } catch (EmptyNameException e) {
                ui.showItemEmptyName();
            } catch (ItemNotFoundException e) {
                ui.showItemNotFound();
            }
            break;
        case (Constants.COMMAND_TIPS):
            try {
                new ItemsTipsCommand().execute(itemManager);
            } catch (NoItemsTipsCanBeGivenException e) {
                ui.showNoItemsTipsCanBeGiven();
            }
            break;
        default:
            ui.showItemsHelp();
        }
    }

    /**
     * Processes the input price.
     *
     * @param priceInString the price of input in string
     * @return the price of input in BigDecimal
     */
    public BigDecimal processPriceInput(String priceInString) {
        int endIndex = priceInString.indexOf(" ");
        if (endIndex != -1) { // if spaces found in the string, remove anything after and including the first space
            priceInString = priceInString.substring(0, endIndex);
        }
        BigDecimal price = new BigDecimal(priceInString);
        price = price.setScale(Constants.PRICING_SCALE, RoundingMode.HALF_EVEN);
        return price;
    }

    /**
     * process the amount of stock input in string.
     *
     * @param stockInString the amount of stocks in string
     * @return the amount of stocks in integer
     */
    public int processStockInput(String stockInString) {
        int endIndex = stockInString.indexOf(" ");
        if (endIndex != -1) {
            stockInString = stockInString.substring(0, endIndex);
        }
        return Integer.parseInt(stockInString); // returns stock input in integer
    }

    /**
     * Process the updates of an item.
     *
     * @param updateInput the type of update
     * @param itemIndex   the index of item to be updated
     * @param itemManager item manager
     * @throws EmptyItemPriceException             Exception when the item price is empty
     * @throws InvalidItemPriceException           Exception when the item price is invalid
     * @throws NullItemPriceException              Exception when the item price is Null
     * @throws NullItemStockException              Exception when the item stock is Null
     * @throws EmptyItemStockException             Exception when the item stock is empty
     * @throws InvalidItemStockException           Exception when the item stock is invalid
     * @throws WrongItemFieldException             Exception when the item field is wrong
     * @throws NonIntegerNumericItemStockException Exception when the update item stock is not a number
     * @throws NonNumericItemPriceException        Exception when the update item price is not a number
     */
    public void processUpdateAttributeInput(String updateInput, int itemIndex, ItemManager itemManager) throws
            EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException, NullItemStockException,
            EmptyItemStockException, InvalidItemStockException, WrongItemFieldException,
            NonIntegerNumericItemStockException, NonNumericItemPriceException {
        if (updateInput.equals("p")) {
            ui.askForRevisedItemPrice();
            ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();
            BigDecimal revisedItemPrice = itemsPromptPriceCommand.execute();
            itemManager.setRevisedItemPrice(itemIndex, revisedItemPrice);
            ui.showUpdateItemPrice();
        } else if (updateInput.equals("s")) {
            ui.askForRevisedItemStock();
            ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();
            boolean itemAlreadyExists = false;
            int revisedStockPrice = itemsPromptStockCommand.execute(itemAlreadyExists);
            itemManager.setRevisedItemStock(itemIndex, revisedStockPrice);
            ui.showUpdateItemStock();
        } else {
            throw new WrongItemFieldException();
        }
    }
}
