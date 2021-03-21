package seedu.easylog.commands.orderscommands;

import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.OrderEmptyException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;

import java.util.ArrayList;

/**
 * Adds orders to the system.
 */
public class OrdersAddCommand extends OrdersCommand {

    public void execute(String customerName, ItemManager itemManager, OrderManager orderManager)
            throws EmptyNameException, EmptyItemListException, OrderEmptyException {
        if (customerName.equals("")) {
            throw new EmptyNameException();
        }
        if (itemManager.getItemList().isEmpty()) {
            throw new EmptyItemListException();
        }
        ItemsListCommand itemsListCommand = new ItemsListCommand();
        itemsListCommand.execute(itemManager); // to show available items and item stock
        ui.showAddItemsToOrder();
        String addItemsInput = Constants.SCANNER.nextLine();
        Order order = ordersParser.processItemsAddedToOrder(customerName, addItemsInput, itemManager);
        orderManager.addOrder(order);
        assert orderManager.getLatestOrderAdded().equals(order);
        ui.showOrderAdded(order);
    }
}
