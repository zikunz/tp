package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsClearCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.commands.itemscommands.ItemsFindCommand;
import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptPriceCommand;
import seedu.easylog.commands.itemscommands.ItemsPromptStockCommand;
import seedu.easylog.commands.itemscommands.ItemsStatisticsCommand;
import seedu.easylog.commands.itemscommands.ItemsUpdateCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemIndexException;
import seedu.easylog.exceptions.EmptyItemNameException;
import seedu.easylog.exceptions.EmptyItemPriceAndStockInputException;
import seedu.easylog.exceptions.EmptyItemPriceException;
import seedu.easylog.exceptions.EmptyItemStockException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.IncorrectNumberOfItemPriceAndStockInputException;
import seedu.easylog.exceptions.InvalidItemIndexException;
import seedu.easylog.exceptions.InvalidItemPriceException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.InvalidTotalItemStockException;
import seedu.easylog.exceptions.ItemListAlreadyClearedException;
import seedu.easylog.exceptions.ItemNotFoundException;
import seedu.easylog.exceptions.NoItemsStatisticsCanBeGivenException;
import seedu.easylog.exceptions.NonIntegerItemStockException;
import seedu.easylog.exceptions.NonNumericItemPriceException;
import seedu.easylog.exceptions.NullItemNameException;
import seedu.easylog.exceptions.NullItemPriceAndStockInputException;
import seedu.easylog.exceptions.NullItemPriceException;
import seedu.easylog.exceptions.NullItemStockException;
import seedu.easylog.exceptions.WrongItemFieldException;
import seedu.easylog.exceptions.WrongUpdateCommandException;
import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Process items command input.
 */
public class ItemsParser extends Parser {
    public static void processItemsInput(String itemsInput, ItemManager itemManager) {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsInput);
        String itemsType = splitItemsArg[0];
        String itemsArg = splitItemsArg[1];
        ArrayList<String> itemDescriptionRecord = itemManager.getItemDescriptionRecord();

        switch (itemsType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(itemsArg, itemManager, itemDescriptionRecord);
            } catch (EmptyItemNameException e) {
                ui.showItemEmptyName();
            } catch (NonIntegerItemStockException e) {
                ui.showNonIntegerItemPriceInputForAdd();
            } catch (NonNumericItemPriceException e) {
                ui.showNonNumericItemStockInputForAdd();
            } catch (InvalidTotalItemStockException e) {
                ui.showInvalidTotalItemStock();
            } catch (NullItemNameException e) {
                ui.showNullItemName();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
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
            } catch (ItemNotFoundException e) {
                ui.showItemNotFound();
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
            } catch (NonNumericItemPriceException e) {
                ui.showNonNumericItemPrice();
            } catch (NonIntegerItemStockException e) {
                ui.showNonNumericItemStockInput();
            }
            break;
        case (Constants.COMMAND_FIND):
            try {
                new ItemsFindCommand().execute(itemsArg, itemManager);
            } catch (EmptyItemNameException e) {
                ui.showItemEmptyName();
            } catch (ItemNotFoundException e) {
                ui.showItemNotFound();
            }
            break;
        case (Constants.COMMAND_STATISTICS):
            try {
                new ItemsStatisticsCommand().execute(itemManager);
            } catch (NoItemsStatisticsCanBeGivenException e) {
                ui.showNoItemsTipsCanBeGiven();
            }
            break;
        default:
            ui.showItemsHelp();
        }

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
     * @throws EmptyItemPriceException      Exception when the item price is empty
     * @throws InvalidItemPriceException    Exception when the item price is invalid
     * @throws NullItemPriceException       Exception when the item price is Null
     * @throws NullItemStockException       Exception when the item stock is Null
     * @throws EmptyItemStockException      Exception when the item stock is empty
     * @throws InvalidItemStockException    Exception when the item stock is invalid
     * @throws WrongItemFieldException      Exception when the item field is wrong
     * @throws NonIntegerItemStockException Exception when the update item stock is not a number
     * @throws NonNumericItemPriceException Exception when the update item price is not a number
     */
    public void processUpdateAttributeInput(String updateInput, int itemIndex, ItemManager itemManager) throws
            EmptyItemPriceException, NullItemPriceException, NullItemStockException,
            EmptyItemStockException, InvalidItemStockException, WrongItemFieldException,
            NonIntegerItemStockException, NonNumericItemPriceException, InvalidItemPriceException {
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

    public Item promptAndProcessItemPriceAndStock(String itemDescription) {
        BigDecimal itemPrice = null;
        int itemStock = 0;
        boolean stopAskingUserForItemPriceAndStockInput = false;

        while (!stopAskingUserForItemPriceAndStockInput) {
            ui.askForItemPriceAndStock();
            String itemPriceAndStockInput = ui.askForUserInput();

            try {
                if (itemPriceAndStockInput == null) {
                    throw new NullItemPriceAndStockInputException();
                }

                if (itemPriceAndStockInput.equals("")) {
                    throw new EmptyItemPriceAndStockInputException();
                }

                String[] splitInput = itemPriceAndStockInput.split(" ");

                if (splitInput.length != 2) { // magic number to be refactored later
                    throw new IncorrectNumberOfItemPriceAndStockInputException();
                }

                String itemPriceInString = splitInput[0];
                String itemStockInString = splitInput[1];

                itemPrice = itemPriceInStringToBigDecimalFormat(itemPriceInString);
                itemPrice = itemPrice.setScale(Constants.PRICING_SCALE, RoundingMode.HALF_EVEN);
                itemStock = itemStockInStringToIntegerFormat(itemStockInString);
                stopAskingUserForItemPriceAndStockInput = true;
            } catch (NullItemPriceException e) {
                ui.showNullItemPrice();
            } catch (EmptyItemPriceException e) {
                ui.showEmptyItemPrice();
            } catch (NonNumericItemPriceException e) {
                ui.showNonNumericItemStockInputForAdd();
            } catch (InvalidItemPriceException e) {
                ui.showInvalidItemPrice();
            } catch (NullItemStockException e) {
                ui.showNullItemStock();
            } catch (EmptyItemStockException e) {
                ui.showEmptyItemStock();
            } catch (NonIntegerItemStockException e) {
                ui.showNonIntegerItemPriceInputForAdd();
            } catch (InvalidItemStockException e) {
                ui.showInvalidItemStock();
            } catch (IncorrectNumberOfItemPriceAndStockInputException e) {
                ui.showIncorrectNumberOfItemPriceAndStockInput();
            } catch (EmptyItemPriceAndStockInputException e) {
                ui.showEmptyItemPriceAndStockInput();
            } catch (NullItemPriceAndStockInputException e) {
                ui.showNullItemPriceAndStockInput();
            }
        }

        Item item = new Item(itemDescription, itemPrice, itemStock);

        return item;
    }

    public BigDecimal itemPriceInStringToBigDecimalFormat(String itemPriceInString) throws NullItemPriceException,
            EmptyItemPriceException, NonNumericItemPriceException, InvalidItemPriceException {
        if (itemPriceInString == null) {
            throw new NullItemPriceException();
        }

        String itemPriceInStringAfterTrimming = itemPriceInString.trim();
        if (itemPriceInStringAfterTrimming.equals("")) {
            throw new EmptyItemPriceException();
        }

        try {
            double itemPriceInDouble = Double.parseDouble(itemPriceInString);
            if (itemPriceInDouble < Constants.MINIMUM_ITEM_PRICE || itemPriceInDouble > Constants.MAXIMUM_ITEM_PRICE) {
                throw new InvalidItemPriceException();
            }
        } catch (NumberFormatException e) {
            throw new NonNumericItemPriceException();
        }

        BigDecimal itemPriceInBigDecimal = new BigDecimal(itemPriceInString);

        return itemPriceInBigDecimal;
    }

    public int itemStockInStringToIntegerFormat(String itemStockInString) throws NullItemStockException,
            EmptyItemStockException, NonIntegerItemStockException, InvalidItemStockException {
        if (itemStockInString == null) {
            throw new NullItemStockException();
        }

        String itemStockInStringAfterTrimming = itemStockInString.trim();
        if (itemStockInStringAfterTrimming.equals("")) {
            throw new EmptyItemStockException();
        }

        try {
            int itemStockInInteger = Integer.parseInt(itemStockInString);
            if (itemStockInInteger < Constants.MINIMUM_ITEM_STOCK
                    || itemStockInInteger > Constants.MAXIMUM_ITEM_STOCK) {
                throw new InvalidItemStockException();
            }
        } catch (NumberFormatException e) {
            throw new NonIntegerItemStockException();
        }

        int itemStockInInteger = Integer.parseInt(itemStockInString);

        return itemStockInInteger;
    }
}
