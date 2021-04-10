package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyOrderIndexException;
import seedu.easylog.exceptions.InvalidOrderIndexException;
import seedu.easylog.exceptions.EmptyOrderListException;

import seedu.easylog.model.ItemManager;
import seedu.easylog.model.OrderManager;
import seedu.easylog.model.Item;

public class OrdersDeleteCommand extends OrdersCommand {
    /**
     * Deletes a single order from the list of orders.
     */
    public void execute(String ordersArg, ItemManager itemManager, OrderManager orderManager)
            throws EmptyOrderIndexException, InvalidOrderIndexException, EmptyOrderListException {
        if (ordersArg.equals("")) {
            throw new EmptyOrderIndexException();
        }
        int ordersListSize = orderManager.getSize();
        if (ordersListSize == 0) {
            throw new EmptyOrderListException();
        }
        try {
            int index = Integer.parseInt(ordersArg) - Constants.ARRAY_OFFSET;
            int size = orderManager.getSize();
            if ((index < 0) || (index >= size)) {
                throw new InvalidOrderIndexException();
            }
            int orderIndex = Integer.parseInt(ordersArg) - Constants.ARRAY_OFFSET;
            addBackItemsAndRemoveItemSales(orderIndex, itemManager, orderManager);
            ui.showOrderDeleted(orderManager.getOrder(index));
            orderManager.deleteOrder(index);
        } catch (NumberFormatException e) {
            ui.showNonIntegerOrderIndex();
        }
        int size = orderManager.getSize();
        assert orderManager.getSize() == size - 1 : "After a valid deletion, the size decreases by 1";
        if (size > 1) {
            assert orderManager.getOrder(orderManager.getSize() - 1) == orderManager.getOrder(size - 2) :
                    "After a valid deletion, the second last order becomes the last order";
        }
    }

    public void addBackItemsAndRemoveItemSales(int orderIndex, ItemManager itemManager, OrderManager orderManager) {
        if (!orderManager.getOrder(orderIndex).getStatus()) {
            // return item stock to inventory if order is not complete.
            int itemIndex = 0;
            for (Item item : orderManager.getItemsInOrder(orderIndex)) {
                if (itemManager.getItemList().contains(item)) {
                    int itemCurrentStock = item.getItemStock();
                    int itemsStockInOrder = orderManager.getOrder(orderIndex).getStockCounts().get(itemIndex);
                    int itemUpdateStock = itemCurrentStock + itemsStockInOrder;
                    item.setItemStock(itemUpdateStock);
                    int itemCurrentSales = item.getItemSales();
                    int itemSalesInOrder = orderManager.getOrder(orderIndex).getStockCounts().get(itemIndex);
                    int itemUpdateSales = itemCurrentSales - itemSalesInOrder;
                    item.setItemSales(itemUpdateSales);
                    ++itemIndex;
                }
            }
        }
    }
}

