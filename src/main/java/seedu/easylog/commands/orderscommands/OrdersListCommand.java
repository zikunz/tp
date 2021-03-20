package seedu.easylog.commands.orderscommands;

import seedu.easylog.item.ItemManager;
import seedu.easylog.order.OrderManager;
import seedu.easylog.common.Messages;

public class OrdersListCommand extends OrdersCommand {
    /**
     * Prints the list of orders.
     */
    public void execute(ItemManager itemManager, OrderManager orderManager) {
        int orderSize = orderManager.getSize();
        String customerName;
        String customersItems;
        String shippingStatus;
        int totalPrice;
        String rawOrderListOutput = "";

        for (int i = 0; i < orderSize; i++) {
            customerName = (i + 1) + ". " + orderManager.getCustomerName(i);
            shippingStatus = " [" + orderManager.getOrder(i).getStatusIcon() + "]";
            customersItems =
                    itemManager.getItemListPrintFormat(orderManager.getItemsInOrder(i), true);
            totalPrice = orderManager.getOrder(i).getOrderTotalPrice(orderManager.getItemsInOrder(i));
            rawOrderListOutput += customerName + shippingStatus + "\n" + customersItems
                    + Messages.MESSAGE_INDENTATION + "Total Price : S$" + totalPrice + "\n";
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
