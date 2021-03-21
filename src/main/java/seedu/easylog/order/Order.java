package seedu.easylog.order;

import seedu.easylog.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Handles orders related information.
 */
public class Order {

    protected String customerName;
    protected ArrayList<Item> itemsInOrder;
    protected ArrayList<Integer> itemsStockCount;
    protected boolean isShipped;

    public Order(String customerName, ArrayList<Item> itemsInOrder, ArrayList<Integer> itemsStockCount) {
        this.customerName = customerName;
        this.itemsInOrder = itemsInOrder;
        this.itemsStockCount = itemsStockCount;
        this.isShipped = false;
        assert customerName != null;
        assert itemsInOrder != null;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItemsInOrder() {
        return itemsInOrder;
    }

    public ArrayList<Integer> getStockCounts() {
        return itemsStockCount;
    }

    public String getAddOrderMessage() {
        return "Got it! The order for customer [" + customerName + "] is added.";
    }

    public String getDeleteOrderMessage() {
        return "Got it! The order for customer [" + customerName + "] is deleted.";
    }

    public BigDecimal getOrderTotalPrice(ArrayList<Item> itemsInOrder) {
        BigDecimal totalPrice = new BigDecimal(0);
        int stockIndex = 0;
        for (Item item : itemsInOrder) {
            totalPrice = totalPrice.add(item.getItemPrice().multiply(new BigDecimal(itemsStockCount.get(stockIndex))));
        }
        return totalPrice;
    }

    public String getOrderTotalPriceMessage(Order order) {
        return "The total price for customer [" + customerName + "]'s order is S$"
                + order.getOrderTotalPrice(itemsInOrder) + ".";
    }

    public String getStatusIcon() {
        return (isShipped ? "X" : ""); //return X or empty symbols
    }

    public void markAsShipped() {
        isShipped = true;
    }

    public String getOrderShippingStatusMessage() {
        return "Got it! The order for customer [" + customerName + "] has been shipped.";
    }
}
