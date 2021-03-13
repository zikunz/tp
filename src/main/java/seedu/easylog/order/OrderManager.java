package seedu.easylog.order;

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

}
