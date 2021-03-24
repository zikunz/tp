package seedu.easylog.commands.orderscommands;

import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.model.OrderManager;

public class OrdersClearCommand extends OrdersCommand {
    /**
     * Clears all orders in the system.
     */
    public void execute(OrderManager orderManager) throws OrderListAlreadyClearedException {
        if (orderManager.getSize() == 0) {
            throw new OrderListAlreadyClearedException();
        }
        assert ui != null : "ui should not be null";
        ui.showClearedOrderList();

        assert orderManager != null : "orderManager should not be null";
        orderManager.clearOrderList();
    }
}
