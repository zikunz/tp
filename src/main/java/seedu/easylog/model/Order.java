package seedu.easylog.model;

import seedu.easylog.common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Handles orders related information.
 */
public class Order {

    protected String customerName;
    protected ArrayList<Item> itemsInOrder;
    protected ArrayList<Integer> itemsStockCount;
    protected boolean isDone;

    public Order(String customerName, ArrayList<Item> itemsInOrder, ArrayList<Integer> itemsStockCount) {
        this.customerName = customerName;
        this.itemsInOrder = itemsInOrder;
        this.itemsStockCount = itemsStockCount;
        this.isDone = false;
        assert customerName != null;
        assert itemsInOrder != null;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItemsInOrder() {
        return itemsInOrder;
    }

    public Item getItemInOrder(int i) {
        return itemsInOrder.get(i);
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
        return (isDone ? "X" : ""); //return X or empty symbols
    }

    public boolean getStatus() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }

    public String getOrderStatusMessage() {
        return "Got it! The order for customer [" + customerName + "] is completed.";
    }

    /**
     * Convert order attributes to a string to save in save file.
     * @param itemManager manipulates item inventory.
     * @return 1 line string that contains details regarding the order.
     */
    public String saveToFileFormat(ItemManager itemManager) {
        String itemIndexes = "";
        String itemQuantities = "itemQuantity ";
        String orderStatus = "";
        for (Item item: itemsInOrder) {
            itemIndexes += (itemManager.getItemIndex(item.getItemName()) + Constants.ARRAY_OFFSET) + " ";
        }
        for (int quantity: itemsStockCount) {
            itemQuantities += quantity + " ";
        }
        if (isDone) {
            orderStatus = "done";
        } else {
            orderStatus = "notDone";
        }
        return customerName + " " + itemIndexes + itemQuantities + orderStatus;
    }
}
