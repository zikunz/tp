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

    }

    public void showAddItem(Item item) {

    }

    public void showEmptyName() {

    }
}
