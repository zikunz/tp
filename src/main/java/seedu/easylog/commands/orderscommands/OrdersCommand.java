package seedu.easylog.commands.orderscommands;

import seedu.easylog.storage.Receipt;
import seedu.easylog.ui.Ui;
import seedu.easylog.parser.OrdersParser;

/**
 * OrderCommand constructor.
 */
public abstract class OrdersCommand {

    public Ui ui = new Ui();
    public OrdersParser ordersParser = new OrdersParser();
    public Receipt receipt = new Receipt();
}
