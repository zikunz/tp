package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;
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
            throws EmptyNameException, EmptyItemListException {
        if (customerName.equals("")) {
            throw new EmptyNameException();
        }
        if (itemManager.getItemList().isEmpty()) {
            throw new EmptyItemListException();
        }
        ui.showAddItemsToOrder();
        ArrayList<Item> itemsInOrder;
        do {
            String itemsAdded = Constants.SCANNER.nextLine();
            itemsInOrder = ordersParser.processItemsAddedToOrder(itemsAdded, itemManager);
        } while (itemsInOrder.isEmpty());
        Order order = new Order(customerName, itemsInOrder);
        orderManager.addOrder(order);
        assert orderManager.getLatestOrderAdded().equals(order);
        ui.showOrderAdded(order);
    }
}
