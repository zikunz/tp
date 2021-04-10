package seedu.easylog.commands.orderscommands;

import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.model.ItemManager;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

import java.util.ArrayList;

public class OrdersClearCommand extends OrdersCommand {
    /**
     * Clears all orders in the system.
     */
    public void execute(ItemManager itemManager, OrderManager orderManager) throws OrderListAlreadyClearedException {
        if (orderManager.getSize() == 0) {
            throw new OrderListAlreadyClearedException();
        }

        assert ui != null : "ui should not be null";
        assert orderManager != null : "orderManager should not be null";

        ui.showClearedOrderList();

        ArrayList<Order> orderList = orderManager.getOrderList();
        int orderListSize = orderList.size();
        OrdersDeleteCommand ordersDeleteCommand = new OrdersDeleteCommand();

        for (int itemIndex = 0; itemIndex < orderListSize; itemIndex++) {
            ordersDeleteCommand.addBackItemsAndRemoveItemSales(itemIndex, itemManager, orderManager);
        }

        orderManager.clearOrderList();
        logging.writeInfoLevelLog("All orders are cleared.");
    }
}
