package seedu.easylog.order;

import seedu.easylog.item.Item;

import java.util.ArrayList;

/**
 * Handles orders related information.
 */
public class Order {

    protected String customerName;
    protected ArrayList<Item> itemsInOrder;
    protected boolean isShipped;

    public Order(String customerName, ArrayList<Item> itemsInOrder) {
        this.customerName = customerName;
        this.itemsInOrder = itemsInOrder;
        isShipped = false;
        assert customerName != null;
        assert itemsInOrder != null;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItemsInOrder() {
        return itemsInOrder;
    }

    public String getAddOrderMessage() {
        return "Got it! The order for customer [" + customerName + "] is added.";
    }

    public String getDeleteOrderMessage() {
        return "Got it! The order for customer [" + customerName + "] is deleted.";
    }

    public int getOrderTotalPrice(ArrayList<Item> itemsInOrder) {
        int totalPrice = 0;
        for (Item item : itemsInOrder) {
            String rawTotalPrice = item.getItemPrice();
            totalPrice += Integer.parseInt(rawTotalPrice);
        }
        return totalPrice;
    }

    public String getOrderTotalPriceMessage(Order order) {
        return "The total price for customer [" + customerName + "]'s order is s$"
                + order.getOrderTotalPrice(itemsInOrder) + ".";
    }

    public String getStatusIcon() {
        return (isShipped ? "X" : ""); //return X or empty symbols
    }

    public void markAsShipped(){
        isShipped = true;
    }

    public String getOrderShippingStatusMessage() {
        return "Got it! The order for customer [" + customerName + "] has been shipped.";
    }
}
