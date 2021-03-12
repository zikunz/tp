package seedu.easylog.ui;

import seedu.easylog.common.Messages;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;

/**
 * Handles ui related methods.
 */
public class Ui {

    public void showGreeting() {
        String greeting = "Hello! I'm easyLog!\n" + "What can I do for you? Enter help to view commands.";
        System.out.println(greeting);
    }

    public void showExit() {
        String exit = "Bye. Thanks for using easyLog!";
        System.out.println(exit);
    }

    public void showHelp() {

    }

    public void showItemsHelp() {
        System.out.println(Messages.MESSAGE_SHOW_ITEMS_COMMANDS);
    }

    public void showInvalidCommand() {
        String invalidCommandMessage = "OOPS!!! I'm Sorry! I don't know what that means.\n"
                + "Please input again! :)";
        System.out.println(invalidCommandMessage);
    }

    public void showAddItem(Item item) {
        System.out.println(item.getAddItemMessage());
    }

    public void showItemEmptyName() {
        String emptyItemMessage = "OOPS!!!. The item name is missing!\n"
                + "Please complete the information! :) ";
        System.out.println(emptyItemMessage);
    }

    public void showOrderEmptyCustomerName() {
        String showOrderEmptyCustomerName = "OOPS!!!. The customer name is missing!\n"
                + "Please complete the information! :) ";
        System.out.println(showOrderEmptyCustomerName);
    }

    public void showDeletedItem(Item item) {
        System.out.println(item.getDeleteItemMessage());
    }

    public void showEmptyNumber() {

    }

    public void showItemList(String rawItemListOutput) {
        System.out.println(Messages.MESSAGE_LIST_ITEMS);
        System.out.print(rawItemListOutput);
    }

    public void showOrdersHelp() {

    }

    public void showAddItemsToOrder() {
        System.out.println(Messages.MESSAGE_ADD_ITEMS_TO_ORDER);
    }

    public void showOrderAdded(Order order) {
        System.out.println(order.getAddOrderMessage());
    }
}
