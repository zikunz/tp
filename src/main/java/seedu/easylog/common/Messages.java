package seedu.easylog.common;

public class Messages {

    public static final String MESSAGE_LIST_ITEMS = "Here is the list of items in the warehouse.";
    public static final String MESSAGE_FOUNDLIST_ITEMS = "Here is the list of relevant items found.";
    public static final String MESSAGE_LIST_ORDERS = "Here is the list of orders.";
    public static final String MESSAGE_FOUNDLIST_ORDERS = "Here is the list of relevant orders found.";
    public static final String MESSAGE_ADD_ITEMS_TO_ORDER = "Input the items to be added to this order.";
    public static final String MESSAGE_SHOW_ALL_COMMANDS = "General Options:\n"
            + "  1. items                          Show items-related commands\n"
            + "  2. items add <item_name>          Add an item\n"
            + "  3. items list                     List all items\n"
            + "  4. items delete <item_index>      Delete an item\n"
            + "  5. items clear                    Empty all items\n"
            + "  6. items find <item_name>         Finding an item\n"
            + "  7. orders                         Show orders-related commands\n"
            + "  8. orders add <order_name>        Add an order\n"
            + "  9. orders list                    List all orders\n"
            + "  10. orders delete <order_index>   Delete an order\n"
            + "  11. orders clear                  Empty all orders\n"
            + "  12. orders find <order_name>      Finding an order";
    public static final String MESSAGE_GREETING = "Hello! I'm easyLog!\n"
            + "What can I do for you? Enter help to view commands.";
    public static final String MESSAGE_GOODBYE = "Bye. Thanks for using easyLog!";
    public static final String MESSAGE_INVALID_COMMAND = "OOPS!!! I'm sorry! I don't know what that means.\n"
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
            + "  4. orders clear                   Empty all orders\n"
            + "  5. orders price <order_index>     check the total price of an order\n"
            + "  6. orders ship <order_index>      update the shipping status of an order";
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
            + "Please input again and give a valid item price! :)";
    public static final String MESSAGE_NULL_ITEM_PRICE = "OOPS!!! The input item price is null!\n"
            + "Please input again and complete the item price! :)";
    public static final String MESSAGE_EMPTY_ITEM_PRICE = "OOPS!!! The input item price is empty!\n"
            + "Please input again and complete the item price! :)";
    public static final String MESSAGE_NON_NUMERIC_INPUT_FOR_ADD =
            "OOPS!!! The input item is not a number!\n"
            + "Please retry items add command and give a number for stock/price! :)";
    public static final String MESSAGE_NON_NUMERIC_INPUT_FOR_UPDATE =
            "OOPS!!! The input item is not a number!\n"
                    + "Please retry items update command and give a number for stock/price! :)";
    public static final String MESSAGE_PROMPT_ITEM_STOCK =
            "Please enter the stock of the item.\n"
                    + "Note: The stock to be entered should be either 0 or a positive integer number "
                    + "smaller than or equal to 100000000 "
                    + "(The warehouse cannot store more than one hundred million items.)";
    public static final String MESSAGE_SHOW_INVALID_ITEM_STOCK = "OOPS!!! The item stock is invalid!\n"
            + "Please input again and give a valid item stock! :)";
    public static final String MESSAGE_NULL_ITEM_STOCK = "OOPS!!! The input item stock is null!\n"
            + "Please input again and give a valid item stock! :)";
    public static final String MESSAGE_EMPTY_ITEM_STOCK = "OOPS!!! The input item stock is empty!\n"
            + "Please input again and complete the item stock! :)";
    public static final String MESSAGE_WRONG_UPDATE_COMMAND = "OOPS!!! I'm sorry! I don't know what that means.\n"
            + "Do you mean \"items update\"? Alternatively, see \"items help\" for more information";
    public static final String MESSAGE_ASK_FOR_ITEM_INDEX = "Below is the exhaustive list for all items. May I know"
            + " which item should be updated? Please input the index of the item of interest only.";
    public static final String MESSAGE_ASK_FOR_ITEM_FIELD_TO_BE_UPDATED = "What would you like to update, price "
            + "or stock? (p/s)";
    public static final String MESSAGE_ASK_FOR_REVISED_ITEM_PRICE = "What is the revised item price?";
    public static final String MESSAGE_SHOW_UPDATE_ITEM_PRICE = "Done! I just updated the item price for you.";
    public static final String MESSAGE_WRONG_ITEM_FIELD_COMMAND = "OOPS!!! I'm sorry! I don't know what that means.\n"
            + "Please input either \"p\" for (item) price or s for (item) stock.";
    public static final String MESSAGE_INVALID_ITEM_INDEX = "OOPS!!! The item index is invalid!\n"
            + "Please input again and give a valid item index! :)";
    public static final String MESSAGE_EMPTY_ITEM_INDEX = "OOPS!!! The item index is empty!\n"
            + "Please input again and complete the item index! :)";
    public static final String MESSAGE_ASK_FOR_REVISED_ITEM_STOCK = "What is the revised item stock?";
    public static final String MESSAGE_SHOW_UPDATE_ITEM_STOCK = "Done! I just updated the item stock for you.";
    public static final String MESSAGE_EMPTY_ORDER = "No items added to the order. Please input `orders add` "
            + "command again!";
    public static final String MESSAGE_NOT_ENOUGH_STOCK = "Not enough stock to be added into the order. "
            + "Please retry and type valid stock number.";
    public static final String MESSAGE_CONTINUE_ADDING_ITEM_TO_ORDER = "Type (stop) to stop adding items to order,"
            + " else continue entering items in the same format.\nNote that you need at least 1 item in the order.";
    public static final String MESSAGE_INVALID_STOP_ADDING_ITEM_TO_ORDER = "Invalid stop command to stop adding"
            + " items to the order. Type (stop) for the correct command.\nPlease retry orders add command.";
    public static final String MESSAGE_INVALID_FORMAT_ORDERS_ADD = "Invalid format for inputting of items into order."
            + "Please retry orders add command.";
    public static final String MESSAGE_ITEM_NOT_FOUND = "Sorry! No relevant item is found in the warehouse.";
    public static final String MESSAGE_ORDER_NOT_FOUND = "Sorry! No relevant order is found.";
    public static final String MESSAGE_SAVE_DATA_LOADING = "Loading save data.";
    public static final String MESSAGE_LOOKING_FOR_SAVE_DATA = "Looking for save data.";
    public static final String MESSAGE_SAVE_DATA_LOADED = "Save data loaded.";
    public static final String MESSAGE_SAVE_DATA_CREATED = "Save data created as there is no existing save data";
    public static final String MESSAGE_SAVE_DATA_SAVED = "Save data saved.";
    public static final String MESSAGE_SAVE_DATA_NOT_FOUND = "Save data not found.";
    public static final String MESSAGE_INVALID_FILE_INPUT_LINE = "Invalid file input at line : ";
    public static final String MESSAGE_ERROR_WHILE_SAVING = "Error while saving. Save file may or may not be "
            + "saved correctly";
    public static final String  MESSAGE_REPEAT_ITEM = "OOPS!! This item already exist. "
            + "\nPlease use update function to make modification or use a different name. Thank you!";
    public static final String MESSAGE_REPEAT_ORDER = "OOPS!! This order already exist."
            + "\nPlease use a different name for ordering. Thank you!"
            + "\nTo update an Order, please delete the original order and recreate a new one."
            + "\nFor completed order, please delete and create a new order to proceed on.";
}

