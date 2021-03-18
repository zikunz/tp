package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;

import java.util.ArrayList;

public class OrdersDeleteCommand extends OrdersCommand {
    /**
     * Deletes a single order from the list of orders.
     */
    public void execute(String ordersArg) throws EmptyNumberException, InvalidNumberException, NumberFormatException {
        if (ordersArg.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(ordersArg) - Constants.ARRAY_OFFSET;
        int size = orderManager.getSize();
        if ((index < 0) || (index >= size)) {
            throw new InvalidNumberException();
        }
        ui.showOrderDeleted(orderManager.getOrder(index));
        orderManager.deleteOrder(index);
        assert orderManager.getSize() == size - 1 : "After a valid deletion, the size decreases by 1";
        if (size > 1) {
            assert orderManager.getOrder(orderManager.getSize() - 1) == orderManager.getOrder(size - 2) :
                    "After a valid deletion, the second last order becomes the last order";
        }
    }
}

