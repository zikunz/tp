package seedu.easylog.ui;

import seedu.easylog.common.Constants;
import seedu.easylog.common.Messages;
import seedu.easylog.model.Item;
import seedu.easylog.model.Order;

/**
 * Handles ui related methods.
 */
public class Ui {

    public void showGreeting() {
        System.out.println(Messages.MESSAGE_GREETING);
    }

    public void showExit() {
        System.out.println(Messages.MESSAGE_GOODBYE);
    }

    public void showHelp() {
        System.out.println(Messages.MESSAGE_SHOW_ALL_COMMANDS);
    }

    public void showItemsHelp() {
        System.out.println(Messages.MESSAGE_SHOW_ITEMS_COMMANDS);
    }

    public void showInvalidCommand() {
        System.out.println(Messages.MESSAGE_INVALID_COMMAND);
    }

    public void showAddItem(Item item) {
        System.out.println(item.getAddItemMessage());
    }

    public void showItemEmptyName() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_NAME);
    }

    public void showOrderEmptyCustomerName() {
        System.out.println(Messages.MESSAGE_EMPTY_ORDER_CUSTOMER_NAME);
    }

    /**
     * Prints a message to notify the user that there is no input order number.
     * This means the user should complete the order number.
     */
    public void showOrderEmptyNumber() {
        System.out.println(Messages.MESSAGE_EMPTY_ORDER_NUMBER);
    }

    public void showDeletedItem(Item item) {
        System.out.println(item.getDeleteItemMessage());
    }

    public void showItemEmptyNumber() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_NUMBER);
    }

    /**
     * Prints a message to notify the user that the input item number is not an integer.
     * This means the user should input an integer type item number.
     */
    public void showNonIntegerItemNumber() {
        System.out.println(Messages.MESSAGE_NON_INTEGER_ITEM_NUMBER);
    }

    /**
     * Prints the list of all items in the system.
     *
     * @param rawItemListOutput List of items in String format
     */
    public void showItemList(String rawItemListOutput) {
        if (rawItemListOutput.equals("")) {
            System.out.println(Messages.MESSAGE_EMPTY_ITEM_LIST);
        } else {
            System.out.println(Messages.MESSAGE_LIST_ITEMS);
            System.out.print(rawItemListOutput);
        }
    }

    /**
     * Prints a message to notify the user that the item list is empty.
     */
    public void showEmptyItemList() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_LIST);
    }

    public void showAddItemFirst() {
        System.out.println(Messages.MESSAGE_ADD_ITEM_FIRST);
    }

    /**
     * Prints the list of all orders in the system.
     * This includes each customer's name
     * followed by his or her items in the record.
     *
     * @param rawOrderListOutput List of orders in String format
     */
    public void showOrderList(String rawOrderListOutput) {
        if (rawOrderListOutput.equals("")) {
            System.out.println(Messages.MESSAGE_EMPTY_ORDER_LIST);
        } else {
            System.out.println(Messages.MESSAGE_LIST_ORDERS);
            System.out.print(rawOrderListOutput);
        }
    }

    public void showOrdersHelp() {
        System.out.println(Messages.MESSAGE_SHOW_ORDERS_RELATED_COMMANDS);
    }

    public void showAddItemsToOrder() {
        System.out.println(Messages.MESSAGE_ADD_ITEMS_TO_ORDER);
    }

    public void showOrderAdded(Order order) {
        System.out.println(order.getAddOrderMessage());
    }

    /**
     * Prints a message to notify the user that this order is deleted successfully.
     *
     * @param order an object to store orders information
     */
    public void showOrderDeleted(Order order) {
        System.out.println(order.getDeleteOrderMessage());
    }

    /**
     * Prints a message to notify the user that the input order number is out of range.
     * This means the user should input another order number.
     */
    public void showInvalidItemNumber() {
        System.out.println(Messages.MESSAGE_INVALID_ITEM_NUMBER);
    }

    /**
     * Prints a message to notify the user that the input order number is not an integer.
     * This means the user should input an integer type order number.
     */
    public void showNonIntegerOrderNumber() {
        System.out.println(Messages.MESSAGE_NON_INTEGER_ORDER_NUMBER);
    }

    /**
     * Prints a message to notify the user that the input order number is out of range.
     * This means the user should input another order number.
     */
    public void showInvalidOrderNumber() {
        System.out.println(Messages.MESSAGE_INVALID_ORDER_NUMBER);
    }

    /**
     * Prints a message to notify the user that there is no single item in the system.
     * This means the user should not attempt to clear items.
     */
    public void showAlreadyClearedItemList() {
        System.out.println(Messages.MESSAGE_ALREADY_CLEARED_ITEM_LIST);
    }

    /**
     * Prints a message to notify the user that there is no single order in the system.
     * This means the user should not attempt to clear orders.
     */
    public void showAlreadyClearedOrderList() {
        System.out.println(Messages.MESSAGE_ALREADY_CLEARED_ORDER_LIST);
    }

    /**
     * Prints a message to notify the user that all the items are cleared successfully.
     */
    public void showClearedItemList() {
        System.out.println(Messages.MESSAGE_CLEAR_ITEM_LIST);
    }

    /**
     * Prints a message to notify the user that all the orders are cleared successfully.
     */
    public void showClearedOrderList() {
        System.out.println(Messages.MESSAGE_CLEAR_ORDER_LIST);
    }

    public void showItemNotFoundWhenAddingToOrder(int index) {
        int itemNumber = index + Constants.ARRAY_OFFSET;
        System.out.println("Item number " + itemNumber + " does not exist. "
                + "Please try another valid item number until at least one item is added to the order.");
    }

    /**
     * Prints a message to ask the user about the price of the item entered earlier.
     */
    public void promptItemPrice() {
        System.out.println(Messages.MESSAGE_PROMPT_ITEM_PRICE);
    }

    /**
     * Prints a message to notify the user that the input item price is invalid.
     * This means the user should input either 0 or a positive number
     * smaller than or equal to 1000000000
     */
    public void showInvalidItemPrice() {
        System.out.println(Messages.MESSAGE_SHOW_INVALID_ITEM_PRICE);
    }

    /**
     * Prints a message to notify the user that the input  is not numeric.
     * This means the user should input a numeric and valid field.
     */
    public void showNonNumericInputForAdd() {
        System.out.println(Messages.MESSAGE_NON_NUMERIC_INPUT_FOR_ADD);
    }

    public void showNonNumericInputForUpdate() {
        System.out.println(Messages.MESSAGE_NON_NUMERIC_INPUT_FOR_UPDATE);
    }

    /**
     * Prints a message to notify the user that the input item price is null.
     * This means the user should input a non-null and valid item price.
     */
    public void showNullItemPrice() {
        System.out.println(Messages.MESSAGE_NULL_ITEM_PRICE);
    }

    /**
     * Prints a message to notify the user that the input item price is empty.
     * This means the user should input a non-empty and valid item price.
     */
    public void showEmptyItemPrice() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_PRICE);
    }

    /**
     * Prints a message to ask the user about the stock of the item entered earlier.
     */
    public void promptItemStock() {
        System.out.println(Messages.MESSAGE_PROMPT_ITEM_STOCK);
    }

    /**
     * Prints a message to notify the user that the input item stock is invalid.
     * This means the user should input either 0 or a positive integer number
     * smaller than or equal to 100000000.
     */
    public void showInvalidItemStock() {
        System.out.println(Messages.MESSAGE_SHOW_INVALID_ITEM_STOCK);
    }

    /**
     * Prints a message to notify the user that the input item stock is null.
     * This means the user should input a non-null and valid item stock.
     */
    public void showNullItemStock() {
        System.out.println(Messages.MESSAGE_NULL_ITEM_STOCK);
    }

    /**
     * Prints a message to notify the user that the input item stock is empty.
     * This means the user should input a non-empty and valid item stock.
     */
    public void showEmptyItemStock() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_STOCK);
    }

    /**
     * Prints a message to notify the user that the update command is entered wrongly.
     * This means the user should input "items update" exactly if he / she
     * really wants to execute an update command for any item of interest.
     */
    public void showWrongUpdateCommand() {
        System.out.println(Messages.MESSAGE_WRONG_UPDATE_COMMAND);
    }

    /**
     * Prints a message to ask the user for the index of the item
     * in order for a field of the item to be updated later.
     */
    public void askForItemIndex() {
        System.out.println(Messages.MESSAGE_ASK_FOR_ITEM_INDEX);
    }

    /**
     * Prints a message to ask the user for the field of the item to be updated.
     */
    public void askForItemFieldToBeUpdated() {
        System.out.println(Messages.MESSAGE_ASK_FOR_ITEM_FIELD_TO_BE_UPDATED);
    }

    /**
     * Prints a message to ask the user about the revised item price.
     */
    public void askForRevisedItemPrice() {
        System.out.println(Messages.MESSAGE_ASK_FOR_REVISED_ITEM_PRICE);
    }

    /**
     * Prints a message to notify the user the item field is updated successfully.
     */
    public void showUpdateItemPrice() {
        System.out.println(Messages.MESSAGE_SHOW_UPDATE_ITEM_PRICE);
    }

    /**
     * Prints a message to notify the user that the item field entered is wrong.
     * This means the user should input either "p" for (item) price
     * or s for (item) stock.
     */
    public void showWrongItemField() {
        System.out.println(Messages.MESSAGE_WRONG_ITEM_FIELD_COMMAND);
    }

    /**
     * Prints a message to notify the user that the input item index is invalid.
     * This means the user should input a valid number corresponding to the index
     * in the item list.
     */
    public void showInvalidItemIndex() {
        System.out.println(Messages.MESSAGE_INVALID_ITEM_INDEX);
    }

    /**
     * Prints a message to notify the user that the input item index is empty.
     * This means the user should input a non-empty and
     * valid number corresponding to the index in the item list.
     */
    public void showEmptyItemIndex() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_INDEX);
    }

    /**
     * Prints a message to inform the users about the total price of their order.
     */
    public void showOrderTotalPrice(Order order) {
        System.out.println(order.getOrderTotalPriceMessage(order));
    }

    /**
     * Prints a message to inform the users about the shipping status of their order.
     */
    public void showOrderShippingStatus(Order order) {
        System.out.println(order.getOrderShippingStatusMessage());
    }

    /**
     * Prints a message to ask the user about the revised item stock.
     */
    public void askForRevisedItemStock() {
        System.out.println(Messages.MESSAGE_ASK_FOR_REVISED_ITEM_STOCK);
    }

    /**
     * Prints a message to notify the user the item field is updated successfully.
     */
    public void showUpdateItemStock() {
        System.out.println(Messages.MESSAGE_SHOW_UPDATE_ITEM_STOCK);
    }

    /**
     * Prints a message to notify user to retype orders add command due to no item added to the order.
     */
    public void showOrderEmpty() {
        System.out.println(Messages.MESSAGE_EMPTY_ORDER);
    }

    public void showNotEnoughStock() {
        System.out.println(Messages.MESSAGE_NOT_ENOUGH_STOCK);
    }

    public void showContinueAddingItemsToOrder() {
        System.out.println(Messages.MESSAGE_CONTINUE_ADDING_ITEM_TO_ORDER);
    }

    public void showItemAndStockAddedToOrder(String itemName, int stockAdded) {
        System.out.println(itemName + " and stock of " + stockAdded + " added to the order.");
    }

    public void showInvalidStopAddingItemToOrder() {
        System.out.println(Messages.MESSAGE_INVALID_STOP_ADDING_ITEM_TO_ORDER);
    }

    public void showInvalidFormatOrdersAdd() {
        System.out.println(Messages.MESSAGE_INVALID_FORMAT_ORDERS_ADD);
    }

    public void showItemNotFound() {
        System.out.println(Messages.MESSAGE_ITEM_NOT_FOUND);
    }

    public void showFoundList(String rawItemListOutput) {
        if (rawItemListOutput.equals("")) {
            System.out.println(Messages.MESSAGE_EMPTY_ITEM_LIST);
        } else {
            System.out.println(Messages.MESSAGE_FOUNDLIST_ITEMS);
            System.out.print(rawItemListOutput);
        }
    }

    public void showFoundOrderList(String rawOrderListOutput) {
        if (rawOrderListOutput.equals("")) {
            System.out.println(Messages.MESSAGE_EMPTY_ORDER_LIST);
        } else {
            System.out.println(Messages.MESSAGE_FOUNDLIST_ORDERS);
            System.out.print(rawOrderListOutput);
        }
    }

    public void showOrderNotFound() {
        System.out.println(Messages.MESSAGE_ORDER_NOT_FOUND);
    }

    public void showSaveDataLoading() {
        System.out.println(Messages.MESSAGE_SAVE_DATA_LOADING);
    }

    public void showLookingForSaveData() {
        System.out.println(Messages.MESSAGE_LOOKING_FOR_SAVE_DATA);
    }

    public void showSaveDataLoaded() {
        System.out.println(Messages.MESSAGE_SAVE_DATA_LOADED);
    }

    public void showSaveDataCreated() {
        System.out.println(Messages.MESSAGE_SAVE_DATA_CREATED);
    }

    public void showSaveDataSaved() {
        System.out.println(Messages.MESSAGE_SAVE_DATA_SAVED);
    }

    public void showNoSaveDataFound() {
        System.out.println(Messages.MESSAGE_SAVE_DATA_NOT_FOUND);
    }

    /**
     * Shows which line in the file causes and error when trying to process it.
     * @param fileLine Line of the file with the format error.
     */
    public void showInvalidFileInputLine(int fileLine) {
        System.out.println(Messages.MESSAGE_INVALID_FILE_INPUT_LINE + fileLine);
    }

    public void showErrorWhileSaving() {
        System.out.println(Messages.MESSAGE_ERROR_WHILE_SAVING);
    }
}
