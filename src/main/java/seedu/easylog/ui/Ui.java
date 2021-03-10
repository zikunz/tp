package seedu.easylog.ui;

import seedu.easylog.item.Item;

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

    }

    public void showInvalidCommand() {
        String invalidCommandMessage = "OOPS!!! I'm Sorry! I don't know what that means.\n"
                + "Please input again! :)";
        System.out.println(invalidCommandMessage);
    }

    public void showAddItem(Item item) {
        item.getAddItemMessage();
    }

    public void showEmptyName() {
        String emptyNameMessage = "OOPS!!!. The item name is missing!\n"
                + "Please complete the information! :) ";
        System.out.println(emptyNameMessage);
    }

    public void showDeletedItem(int index) {
        String deletedItem = "Item " + index + " deleted!";
        System.out.println(deletedItem);
    }

    public void showEmptyNumber() {

    }
}