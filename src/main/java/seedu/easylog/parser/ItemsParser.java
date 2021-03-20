package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.commands.itemscommands.ItemsClearCommand;
import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.commands.itemscommands.ItemsUpdateCommand;
import seedu.easylog.common.Constants;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.NonIntegerNumericItemStockException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.ItemListAlreadyClearedException;
import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.NonNumericItemIndexException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.item.ItemManager;

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
            } catch (NonNumericItemPriceException e) {
                ui.showNonNumericItemPrice();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
            } catch (NonIntegerNumericItemStockException e) {
                ui.showNonIntegerNumericItemStock();
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
            } catch (NonNumericItemIndexException e) {
                ui.showNonNumericItemIndex();
            } catch (EmptyItemPriceException e) {
                ui.showEmptyItemPrice();
            } catch (NullItemPriceException e) {
                ui.showNullItemPrice();
            } catch (NonNumericItemPriceException e) {
                ui.showNonNumericItemPrice();
            } catch (InvalidItemPriceException e) {
                ui.showInvalidItemPrice();
            }
            break;
        default:
            ui.showItemsHelp();
        }
    }
}
