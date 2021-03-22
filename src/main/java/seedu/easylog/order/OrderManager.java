package seedu.easylog.order;

import seedu.easylog.common.Constants;
import seedu.easylog.common.Messages;
import seedu.easylog.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Manage order list manipulation commands.
 */
public class OrderManager {

    private static final ArrayList<Order> ORDER_LIST = new ArrayList<>();

    public void addOrder(Order order) {
        ORDER_LIST.add(order);
    }

    /**
     * Deletes an order from this list of orders.
     *
     * @param index the number of the order to be deleted.
     */
    public void deleteOrder(int index) {
        ORDER_LIST.remove(index);
    }

    /**
     * Gets the item list under a specific order.
     *
     * @param index the number of this order
     * @return a item list
     */
    public Order getOrder(int index) {
        return ORDER_LIST.get(index);
    }

    /**
     * Gets the number of orders in the system.
     *
     * @return the size of order list
     */
    public int getSize() {
        return ORDER_LIST.size();
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
    public ArrayList<Item> getItemsInOrder(int index) {
        return getOrder(index).getItemsInOrder();
    }

    /**
     * Clears all orders in the system.
     */
    public void clearOrderList() {
        ORDER_LIST.clear();
    }

    /**
     * Get latest order added to the order list.
     *
     * @return Latest order added to the order list.
     */
    public Order getLatestOrderAdded() {
        int index = getSize() - Constants.ARRAY_OFFSET;
        return getOrder(index);
    }

    public ArrayList<Integer> getStockCountInOrder(int index) {
        return getOrder(index).getStockCounts();
    }

    public String getOrderListPrintFormat() {
        String rawOrderListOutput = "";
        for (Order order: ORDER_LIST) {
            String customerName = order.getCustomerName();
            String shippingStatus = " [" + order.getStatusIcon() + "]";
            String customersItemList = "";
            int itemAndStockIndex = 0;
            for (Item item: order.getItemsInOrder()) {
                customersItemList += Messages.MESSAGE_INDENTATION + (itemAndStockIndex + 1) + ". "
                        + item.getItemName() + Constants.ITEM_NAME_AND_PRICE_SEPARATOR
                        + item.getItemPrice() + Constants.ITEM_PRICE_AND_STOCK_SEPARATOR
                        + order.getStockCounts().get(itemAndStockIndex) + "\n";
                ++itemAndStockIndex;
            }
            BigDecimal totalPrice = order.getOrderTotalPrice(order.getItemsInOrder());
            rawOrderListOutput += customerName + shippingStatus + "\n" + customersItemList
                    + Messages.MESSAGE_INDENTATION + Constants.TOTAL_PRICE_FORMAT + totalPrice + "\n";
        }
        return rawOrderListOutput;
    }
}
