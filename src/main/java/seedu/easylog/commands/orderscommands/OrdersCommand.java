package seedu.easylog.commands.orderscommands;

import seedu.easylog.ui.Ui;
import seedu.easylog.parser.OrdersParser;

public abstract class OrdersCommand {

    public Ui ui = new Ui();
    public OrdersParser ordersParser = new OrdersParser();
}
