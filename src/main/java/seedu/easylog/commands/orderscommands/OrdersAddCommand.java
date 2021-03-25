package seedu.easylog.commands.orderscommands;

import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.OrderEmptyException;
import seedu.easylog.exceptions.RepeatedOrderException;

import seedu.easylog.model.ItemManager;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

/**
 * Adds orders to the system.
 */
public class OrdersAddCommand extends OrdersCommand {

    public void execute(String customerName, ItemManager itemManager, OrderManager orderManager)
            throws EmptyNameException, EmptyItemListException, OrderEmptyException, RepeatedOrderException {
        if (customerName.equals("")) {
            throw new EmptyNameException();
        }
        if (itemManager.getItemList().isEmpty()) {
            throw new EmptyItemListException();
        }
        if (orderManager.checkRepeatOrder(customerName)) {
            throw new RepeatedOrderException();
        }
        ItemsListCommand itemsListCommand = new ItemsListCommand();
        itemsListCommand.execute(itemManager); // to show available items and item stock
        ui.showAddItemsToOrder();
        String addItemsToOrderInput = Constants.SCANNER.nextLine();
        Order order = ordersParser.processItemsAddedToOrder(customerName, addItemsToOrderInput, itemManager);
        orderManager.addOrder(order);
        assert orderManager.getLatestOrderAdded().equals(order);
        ui.showOrderAdded(order);
    }
}
