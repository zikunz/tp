package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.commands.itemscommands.ItemsClearCommand;
import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.commands.itemscommands.ItemsUpdateCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptPriceCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptStockCommand;
import seedu.easylog.commands.itemscommands.ItemsFindCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.ItemListAlreadyClearedException;
import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.exceptions.ItemNotFoundException;
import seedu.easylog.model.ItemManager;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Process items command input.
 */
public class ItemsParser extends Parser {
    public static void processItemsInput(String itemsInput, ItemManager itemManager) {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsInput);
        String itemsType = splitItemsArg[0];
        String itemsArg = splitItemsArg[1];

        switch (itemsType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(itemsArg, itemManager);
            } catch (EmptyNameException e) {
                ui.showItemEmptyName();
            } catch (InvalidItemPriceException e) {
                ui.showInvalidItemPrice();
            } catch (EmptyItemPriceException e) {
                ui.showEmptyItemPrice();
            } catch (NullItemPriceException e) {
                ui.showNullItemPrice();
            } catch (NumberFormatException e) {
                ui.showNonNumericInputForAdd();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
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
        default:
            ui.showItemsHelp();
        }
    }

    public BigDecimal processPriceInput(String priceInString) {
        int endIndex = priceInString.indexOf(" ");
        if (endIndex != -1) { // if spaces found in the string, remove anything after and including the first space
            priceInString = priceInString.substring(0, endIndex);
        }
        BigDecimal price = new BigDecimal(priceInString);
        price = price.setScale(Constants.PRICING_SCALE, RoundingMode.HALF_EVEN);
        return price;
    }

    public int processStockInput(String stockInString) {
        int endIndex = stockInString.indexOf(" ");
        if (endIndex != -1) {
            stockInString = stockInString.substring(0, endIndex);
        }
        return Integer.parseInt(stockInString); // returns stock input in integer
    }

    public void processUpdateAttributeInput(String updateInput, int itemIndex, ItemManager itemManager) throws
            EmptyItemPriceException, InvalidItemPriceException, NullItemPriceException, NullItemStockException,
            EmptyItemStockException, InvalidItemStockException, WrongItemFieldException {
        if (updateInput.equals("p")) {
            ui.askForRevisedItemPrice();
            ItemsPromptPriceCommand itemsPromptPriceCommand = new ItemsPromptPriceCommand();
            BigDecimal revisedItemPrice = itemsPromptPriceCommand.execute();
            itemManager.setRevisedItemPrice(itemIndex, revisedItemPrice);
            ui.showUpdateItemPrice();
        } else if (updateInput.equals("s")) {
            ui.askForRevisedItemStock();
            ItemsPromptStockCommand itemsPromptStockCommand = new ItemsPromptStockCommand();
            int revisedStockPrice = itemsPromptStockCommand.execute();
            itemManager.setRevisedItemStock(itemIndex, revisedStockPrice);
            ui.showUpdateItemStock();
        } else {
            throw new WrongItemFieldException();
        }
    }
}
