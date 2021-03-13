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
    public void execute(String ordersArg) throws EmptyNumberException, InvalidNumberException {
        if (ordersArg.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(ordersArg) - Constants.ARRAY_OFFSET;
        int size = orderManager.getSize(orderManager.getOrderList());
        if ((index < 0) || (index >= size)) {
            throw new InvalidNumberException();
        }
        ui.showOrderDeleted(orderManager.getOrder(index));
        orderManager.deleteOrder(index);
    }

}
