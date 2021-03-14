package seedu.easylog.commands.orderscommands;

import seedu.easylog.exceptions.OrderListAlreadyClearedException;

public class OrdersClearCommand extends OrdersCommand {
    /**
     * Clears all orders in the system.
     */
    public void execute() throws OrderListAlreadyClearedException {
        if (orderManager.getSize() == 0) {
            throw new OrderListAlreadyClearedException();
        }
        ui.showClearedOrderList();
        orderManager.clearOrderList();
    }
}
