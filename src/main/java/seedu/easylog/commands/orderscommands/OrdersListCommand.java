package seedu.easylog.commands.orderscommands;

public class OrdersListCommand extends OrdersCommand {
    /**
     * Prints the list of orders.
     */
    public void execute() {
        int orderSize = orderManager.getSize();
        String customerName;
        String customersItems;
        String rawOrderListOutput = "";
        boolean shouldIncludeIndentation = true;

        for (int i = 0; i < orderSize; i++) {
            customerName = (i + 1) + ". " + orderManager.getCustomerName(i);
            customersItems = itemManager.getItemListPrintFormat(orderManager.getItems(i), shouldIncludeIndentation);
            rawOrderListOutput += customerName + "\n" + customersItems;
        }
        ui.showOrderList(rawOrderListOutput);

        assert rawOrderListOutput.startsWith("1.") : "rawOrderListOutput is either empty " +
                "or starts with \"1. First Customer's Name\"";
    }
}
