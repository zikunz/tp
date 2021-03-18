package seedu.easylog.ui;

import seedu.easylog.common.Constants;
import seedu.easylog.common.Messages;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;

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

    public void showItemNotFound(int index) {
        int itemNumber = index + Constants.ARRAY_OFFSET;
        System.out.println("Item number " + itemNumber + " does not exist. "
                + "Please try another valid item number until at least one item is added to the order.");
    }
}