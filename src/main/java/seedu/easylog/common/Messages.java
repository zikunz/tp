package seedu.easylog.common;

public class Messages {

    public static final String MESSAGE_LIST_ITEMS = "Here are the list of items in the warehouse.";
    public static final String MESSAGE_LIST_ORDERS = "Here are the list of orders.";
    public static final String MESSAGE_ADD_ITEMS_TO_ORDER = "Input the items to be added to this order.";
    public static final String MESSAGE_SHOW_ALL_COMMANDS = "General Options:\n"
            + "  1. items                          Show items-related commands\n"
            + "  2. items add <item_name>          Add an item\n"
            + "  3. items list                     List all items\n"
            + "  4. items delete <item_index>      Delete an item\n"
            + "  5. items clear                    Empty all items\n"
            + "  6. orders                         Show orders-related commands\n"
            + "  7. orders add <order_name>        Add an order\n"
            + "  8. orders list                    List all orders\n"
            + "  9. orders delete <order_index>    Delete an order\n"
            + "  10. orders clear                  Empty all orders";
    public static final String MESSAGE_GREETING = "Hello! I'm easyLog!\n"
            + "What can I do for you? Enter help to view commands.";
    public static final String MESSAGE_GOODBYE = "Bye. Thanks for using easyLog!";
    public static final String MESSAGE_INVALID_COMMAND = "OOPS!!! I'm Sorry! I don't know what that means.\n"
            + "Please input again! :)";
    public static final String MESSAGE_EMPTY_ITEM_NAME = "OOPS!!! The item name is missing!\n"
            + "Please complete the item information! :) ";
    public static final String MESSAGE_EMPTY_ORDER_CUSTOMER_NAME = "OOPS!!! The customer name is missing!\n"
            + "Please complete the order information! :) ";
    public static final String MESSAGE_EMPTY_ORDER_NUMBER = "OOPS!!! The order number is missing!\n"
            + "Please complete the order information! :)";
    public static final String MESSAGE_INVALID_ITEM_NUMBER = "OOPS!!! The item number is invalid!\n"
            + "Please input the item information again! :)";
    public static final String MESSAGE_INVALID_ORDER_NUMBER = "OOPS!!! The order number is invalid!\n"
            + "Please input the order information again! :)";
    public static final String MESSAGE_EMPTY_ITEM_NUMBER = "OOPS!!! The item number is missing!\n"
            + "Please complete the item information! :)";
    public static final String MESSAGE_SHOW_ORDERS_RELATED_COMMANDS = "Orders-Related Options:\n"
            + "  1. orders add <order_name>        Add an order\n"
            + "  2. orders list                    List all orders\n"
            + "  3. orders delete <order_index>    Delete an order\n"
            + "  4. orders clear                   Empty all orders";
    public static final String MESSAGE_SHOW_ITEMS_COMMANDS = "Items-Related Options:\n"
            + "  1. items add <item_name>          Add an item\n"
            + "  2. items list                     List all items\n"
            + "  3. items delete <item_index>      Delete an item\n"
            + "  4. items clear                    Empty all items";
    public static final String MESSAGE_ALREADY_CLEARED_ITEM_LIST =
            "OOPS!!! There is no single item which can be cleared right now!";
    public static final String MESSAGE_ALREADY_CLEARED_ORDER_LIST =
            "OOPS!!! There is no single order which can be cleared right now!";
    public static final String MESSAGE_CLEAR_ITEM_LIST = "Done! I just cleared all items for you.";
    public static final String MESSAGE_CLEAR_ORDER_LIST = "Done! I just cleared all orders for you.";
    public static final String MESSAGE_EMPTY_ITEM_LIST = "There is no item in the warehouse at the moment.";
    public static final String MESSAGE_EMPTY_ORDER_LIST = "There is no order at the moment.";
    public static final String MESSAGE_ADD_ITEM_FIRST = "Please add items to the system first.";
    public static final String MESSAGE_INDENTATION = "    ";
    public static final String MESSAGE_NON_INTEGER_ORDER_NUMBER = "OOPS!!! The input order information "
            + "is not an integer number!\n"
            + "Please input the order information again! :)";
    public static final String MESSAGE_NON_INTEGER_ITEM_NUMBER = "OOPS!!! The input item information "
            + "is not an integer number!\n"
            + "Please input the item information again! :)";
    public static final String MESSAGE_PROMPT_ITEM_PRICE =
            "Please enter the price of the item.\n"
                    + "Note: The price to be entered should be either 0 or a positive number "
                    + "smaller than or equal to S$1000000000.\n"
                    + "Also, The system supports a maximum scale of 2 (number of digits right after the decimal).\n"
                    + "If you enter any number having a scale greater than 2, it will be automatically rounded up "
                    + "to a number having an exact scale of 2.\n"
                    + "Lastly, the system automatically strips trailing zeros, if any.";
    public static final String MESSAGE_SHOW_INVALID_ITEM_PRICE = "OOPS!!! The item price is invalid!\n"
            + "Please complete the item information! :)";
    public static final String MESSAGE_NULL_ITEM_PRICE = "OOPS!!! The input item price is null!\n"
            + "Please input the item information again! :)";
    public static final String MESSAGE_EMPTY_ITEM_PRICE = "OOPS!!! The input item price is empty!\n"
            + "Please input the item information again! :)";
    public static final String MESSAGE_NON_NUMERIC_ITEM_PRICE = "OOPS!!! The input item price is not a number!\n"
            + "Please input the item information again! :)";
}