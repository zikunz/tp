package seedu.easylog.ui;

import seedu.easylog.common.Messages;
import seedu.easylog.model.Item;
import seedu.easylog.model.Order;

import java.util.Scanner;

/**
 * Handles ui related methods.
 */
public class Ui {

    public static final Scanner SCANNER = new Scanner(System.in);

    public String askForUserInput() {
        return SCANNER.nextLine();
    }

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
        System.out.println(Messages.MESSAGE_LINE);
        System.out.println(item.getAddItemMessage());
        System.out.println(Messages.MESSAGE_LINE);
    }

    public void showItemEmptyName() {
        System.out.println(Messages.MESSAGE_EMPTY_ITEM_NAME);
    }

    public void showRepeatedItem() {
        System.out.println(Messages.MESSAGE_REPEAT_ITEM);
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
        System.out.print(Messages.MESSAGE_LINE);
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
            System.out.print(Messages.MESSAGE_LINE);
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
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(order.getAddOrderMessage());
        System.out.print(Messages.MESSAGE_LINE);
    }

    /**
     * Prints a message to notify the user that this order is deleted successfully.
     *
     * @param order an object to store orders information
     */
    public void showOrderDeleted(Order order) {
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(order.getDeleteOrderMessage());
        System.out.print(Messages.MESSAGE_LINE);
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

    public void showItemNotFoundWhenAddingToOrder(String itemIndex) {
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(itemIndex + " does not exist. "
                + "Please try another valid item number until at least one item is added to the order.");
        System.out.print(Messages.MESSAGE_LINE);
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
     * Prints a message to notify the user that the total item stock is more than 1000000000.
     * This means the user should input another valid number such that
     * total item stock is a positive integer smaller than or equal to 100000000.
     */
    public void showInvalidTotalItemStock() {
        System.out.println(Messages.MESSAGE_SHOW_INVALID_TOTAL_ITEM_STOCK);
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
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(order.getOrderTotalPriceMessage(order));
        System.out.print(Messages.MESSAGE_LINE);
    }

    /**
     * Prints a message to inform the users about the shipping status of their order.
     */
    public void showOrderStatus(Order order) {
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(order.getOrderStatusMessage());
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

    public void showRepeatedOrder() {
        System.out.println(Messages.MESSAGE_REPEAT_ORDER);
    }

    public void showContinueAddingItemsToOrder() {
        System.out.println(Messages.MESSAGE_CONTINUE_ADDING_ITEM_TO_ORDER);
    }

    public void showItemAndStockAddedToOrder(String itemName, int stockAdded) {
        System.out.print(Messages.MESSAGE_LINE);
        System.out.println(itemName + " and stock of " + stockAdded + " added to the order.\n" + Messages.MESSAGE_LINE);
    }

    public void showInvalidWhileAddingItemToOrder() {
        System.out.println(Messages.MESSAGE_INVALID_WHILE_ADDING_ITEM_TO_ORDER);
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
            System.out.print(Messages.MESSAGE_LINE);
        }
    }

    public void showFoundOrderList(String rawOrderListOutput) {
        if (rawOrderListOutput.equals("")) {
            System.out.println(Messages.MESSAGE_EMPTY_ORDER_LIST);
        } else {
            System.out.println(Messages.MESSAGE_FOUND_LIST_ORDERS);
            System.out.print(rawOrderListOutput);
            System.out.print(Messages.MESSAGE_LINE);
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
     *
     * @param fileLine Line of the file with the format error.
     */
    public void showInvalidFileInputLine(int fileLine) {
        System.out.println(Messages.MESSAGE_INVALID_FILE_INPUT_LINE + fileLine);
    }

    public void showErrorWhileSaving() {
        System.out.println(Messages.MESSAGE_ERROR_WHILE_SAVING);
    }

    public void showGeneratingReceipt(String customerName) {
        System.out.println("Generating receipt for customer: " + customerName);
    }

    public void showReceiptGenerated(String customerName) {
        System.out.println("Receipt generated for customer: " + customerName);
        System.out.println(Messages.MESSAGE_LINE);

    }

    public void showErrorGeneratingReceipt(String customerName) {
        System.out.println("Error while generating receipt for customer: " + customerName);
    }

    /**
     * Prints a message to show that an item already exists.
     * This means the user should proceed to enter a valid number to increment the stock,
     * subject to total item stock smaller or equal to 1000000000.
     */
    public void showItemIsAlreadyExisting() {
        System.out.println(Messages.MESSAGE_ITEM_IS_ALREADY_EXISTING);
    }

    /**
     * Prints a message to ask the user about the additional stock of the item entered earlier.
     */
    public void promptAdditionalItemStock() {
        System.out.println(Messages.MESSAGE_PROMPT_ADDITIONAL_ITEM_STOCK);
    }

    /**
     * Prints a message to show the most popular item
     * and suggests the user to stock up if not enough.
     *
     * @param itemDescription description of the most popular item
     */
    public void showStatisticsForMostPopularItem(String itemDescription) {
        System.out.println(Messages.MESSAGE_SHOW_MOST_POPULAR_ITEM + itemDescription
                + Messages.SHOW_CONSIDER_STOCK_UP_IF_MOST_POPULAR_ITEM_IS_NOT_ENOUGH);
    }

    /**
     * Prints a message to show the most popular items
     * and suggests the user to stock up if not enough.
     *
     * @param itemDescriptions descriptions of the most popular items
     */
    public void showStatisticsForMostPopularItems(String itemDescriptions) {
        System.out.println(Messages.MESSAGE_SHOW_MOST_POPULAR_ITEMS + itemDescriptions
                + Messages.SHOW_CONSIDER_STOCK_UP_IF_MOST_POPULAR_ITEMS_ARE_NOT_ENOUGH);
    }

    /**
     * Prints a message to show that no tips regarding items can be given.
     * This means the user has not sold any single item yet.
     */
    public void showNoItemsTipsCanBeGiven() {
        System.out.println(Messages.MESSAGE_SHOW_NO_ITEMS_TIPS_CAN_BE_GIVEN);
    }

    public String showReceiptHeader() {
        return (Messages.MESSAGE_RECEIPT_HEADER + "\n");
    }
}
