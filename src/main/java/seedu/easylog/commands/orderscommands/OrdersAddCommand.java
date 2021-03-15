package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;

import java.util.ArrayList;

public class OrdersAddCommand extends OrdersCommand {

    public void execute(String ordersArg) throws EmptyNameException, EmptyItemListException {
        if (ordersArg.equals("")) {
            throw new EmptyNameException();
        }
        if (itemManager.getItemList().isEmpty()) {
            throw new EmptyItemListException();
        }
        String customerName = ordersArg;
        ui.showAddItemsToOrder();
        ArrayList<Item> itemsInOrder = new ArrayList<>();
        do {
            String itemsAdded = Constants.SCANNER.nextLine();
            itemsInOrder = ordersParser.processItemsAddedToOrder(itemsAdded);
        } while (itemsInOrder.isEmpty());
        Order order = new Order(customerName, itemsInOrder);
        orderManager.addOrder(order);
        ui.showOrderAdded(order);
    }
}
