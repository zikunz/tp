package seedu.easylog.commands.orderscommands;

import seedu.easylog.exceptions.EmptyInformationException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.exceptions.OrderNotFoundException;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

import java.util.ArrayList;

public class OrdersClearCommand extends OrdersCommand {
    /**
     * Clears all orders in the system.
     *
     * @param orderManager order manager
     */
    public void execute(OrderManager orderManager) throws OrderListAlreadyClearedException, OrderNotFoundException,
            InvalidNumberException, EmptyInformationException {
        if (orderManager.getSize() == 0) {
            throw new OrderListAlreadyClearedException();
        }
        assert ui != null : "ui should not be null";

        ArrayList<Order> orderList = orderManager.getOrderList();
        int orderListSize = orderList.size();
        for (int i = 0; i < orderListSize; i++) {
            OrdersDeleteCommand ordersDeleteCommand = new OrdersDeleteCommand();
            String itemIndex = Integer.toString(i);
            ordersDeleteCommand.execute(itemIndex, orderManager);
        }
        ui.showClearedOrderList();

        assert orderManager != null : "orderManager should not be null";
    }
}
