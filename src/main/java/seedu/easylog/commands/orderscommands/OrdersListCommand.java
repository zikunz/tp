package seedu.easylog.commands.orderscommands;

import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;

public class OrdersListCommand extends OrdersCommand {
    /**
     * Prints the list of orders.
     */
    public void execute(ItemManager itemManager, OrderManager orderManager) {
        int orderSize = orderManager.getSize();
        String customerName;
        String customersItems;
        String rawOrderListOutput = "";

        for (int i = 0; i < orderSize; i++) {
            customerName = (i + 1) + ". " + orderManager.getCustomerName(i);
            customersItems =
                    itemManager.getItemListPrintFormat(orderManager.getItemsInOrder(i), true);
            rawOrderListOutput += customerName + "\n" + customersItems;
        }
        ui.showOrderList(rawOrderListOutput);

        boolean isCorrectOutput = false;
        if (rawOrderListOutput == "" || rawOrderListOutput.startsWith("1. ")) {
            isCorrectOutput = true;
        }

        assert isCorrectOutput == true : "rawOrderListOutput is either empty "
                + "or starts with \"1. First Customer's Name\"";
    }
}
