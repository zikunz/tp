package seedu.easylog.commands.orderscommands;

import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.common.Messages;

import java.math.BigDecimal;

public class OrdersListCommand extends OrdersCommand {
    /**
     * Prints the list of orders.
     */
    public void execute(OrderManager orderManager) {

        String rawOrderListOutput = orderManager.getOrderListPrintFormat();
        ui.showOrderList(rawOrderListOutput);

        boolean isCorrectOutput = false;
        if (rawOrderListOutput == "" || rawOrderListOutput.startsWith("1. ")) {
            isCorrectOutput = true;
        }

        assert isCorrectOutput == true : "rawOrderListOutput is either empty "
                + "or starts with \"1. First Customer's Name\"";
    }
}
