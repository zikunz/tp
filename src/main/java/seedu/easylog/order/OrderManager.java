package seedu.easylog.order;

import seedu.easylog.item.Item;

import java.util.ArrayList;

/**
 * Manage order list manipulation commands.
 */
public class OrderManager {

    private static final ArrayList<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void deleteOrder(int index) {
        orderList.remove(index);
    }

    public Order getOrder(int index) {
        return orderList.get(index);
    }

    public int getSize() {
        return orderList.size();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    /**
     * Gets the customer's name specified by the index
     * of the order given.
     *
     * @param index index of the order given
     * @return customer's name specified by the index of the order given
     */
    public String getCustomerName(int index) {
        return getOrder(index).getCustomerName();
    }

    /**
     * Gets the customer's items specified by the index
     * of the order given.
     *
     * @param index index of the order given
     * @return customer's items specified by the index of the order given
     */
    public ArrayList<Item> getItems(int index) {
        return getOrder(index).getItemsInOrder();
    }
}
