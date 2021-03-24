package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.model.OrderManager;

public class OrdersDoneCommand extends OrdersCommand {
    /**
     * Updating the status of the specific order.
     */
    public void execute(String ordersArg, OrderManager orderManager)
            throws EmptyNumberException, InvalidNumberException {
        if (ordersArg.equals("")) {
            throw new EmptyNumberException();
        }
        int index = Integer.parseInt(ordersArg) - Constants.ARRAY_OFFSET;
        int size = orderManager.getSize();
        if ((index < 0) || (index >= size)) {
            throw new InvalidNumberException();
        }
        ui.showOrderShippingStatus(orderManager.getOrder(index));
        orderManager.getOrder(index).markAsDone();

    }
}
