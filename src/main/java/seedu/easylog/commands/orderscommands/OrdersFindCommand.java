package seedu.easylog.commands.orderscommands;

import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.order.OrderManager;

public class OrdersFindCommand extends OrdersCommand {

    public void execute(String customerName, OrderManager orderManager) throws EmptyNameException {

        if (customerName.equals("")) {
            throw new EmptyNameException();
        }
        orderManager.findOrder(customerName);

        String rawOrderListOutput = orderManager.getOrderListPrintFormat();
        ui.showOrderList(rawOrderListOutput);
    }
}
