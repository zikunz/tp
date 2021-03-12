package seedu.easylog.order;

import seedu.easylog.item.Item;
import java.util.ArrayList;

public class Order {

    protected String customerName;
    protected ArrayList<Item> itemsInOrder;

    public Order(String customerName, ArrayList<Item> itemsInOrder) {
        this.customerName = customerName;
        this.itemsInOrder = itemsInOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Item> getItemsInorder() {
        return itemsInOrder;
    }

    public String getAddOrderMessage() {
        return "Got it! The order for customer [" + customerName + "] is added.";
    }
}
