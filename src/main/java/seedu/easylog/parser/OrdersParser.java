package seedu.easylog.parser;

import seedu.easylog.commands.orderscommands.OrdersAddCommand;
import seedu.easylog.commands.orderscommands.OrdersClearCommand;
import seedu.easylog.commands.orderscommands.OrdersDeleteCommand;
import seedu.easylog.commands.orderscommands.OrdersListCommand;
import seedu.easylog.commands.orderscommands.OrdersPriceCommand;
import seedu.easylog.commands.orderscommands.OrdersDoneCommand;
import seedu.easylog.commands.orderscommands.OrdersFindCommand;
import seedu.easylog.common.Constants;

import seedu.easylog.exceptions.CustomerNameTooLongException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyOrderIndexException;
import seedu.easylog.exceptions.InvalidInventoryException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.exceptions.EmptyOrderListException;
import seedu.easylog.exceptions.OrderNotFoundException;
import seedu.easylog.exceptions.InvalidOrderIndexException;
import seedu.easylog.exceptions.WrongOrdersClearCommandException;


import seedu.easylog.model.Item;
import seedu.easylog.model.ItemManager;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

import java.util.ArrayList;

/**
 * Process orders commands input.
 */
public class OrdersParser extends Parser {

    public static void processOrdersInput(String ordersInput, ItemManager itemManager, OrderManager orderManager) {
        String[] splitOrdersArg = splitCommandWordAndArgs(ordersInput);
        String ordersType = splitOrdersArg[0];
        String ordersArg = splitOrdersArg[1];
        switch (ordersType) {
        case (Constants.COMMAND_ADD):
            try {
                logging.writeInfoLevelLog("Orders add command has been inputted by user to be executed.");
                new OrdersAddCommand().execute(ordersArg, itemManager, orderManager);
                logging.writeInfoLevelLog("Orders add command has been successfully executed.");
            } catch (EmptyNameException e) {
                logging.writeInfoLevelLog("No customer name inputted, orders add command sequence"
                        + " terminated.");
                ui.showOrderEmptyCustomerName();
            } catch (EmptyItemListException e) {
                logging.writeInfoLevelLog("Inventory is empty, orders add command sequence terminated.");
                ui.showEmptyItemList();
            } catch (CustomerNameTooLongException e) {
                logging.writeInfoLevelLog("Customer name inputted is too long, orders add command sequence"
                        + " terminated.");
                ui.showCustomerNameTooLong();
            } catch (InvalidInventoryException e) {
                logging.writeInfoLevelLog("All items in inventory have stock 0, orders add command"
                        + " sequence terminated.");
                ui.showInvalidInventory();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new OrdersDeleteCommand().execute(ordersArg, itemManager, orderManager);
            } catch (EmptyOrderListException e) {
                ui.showEmptyOrderList();
            } catch (EmptyOrderIndexException e) {
                ui.showOrderEmptyIndex();
            } catch (InvalidOrderIndexException e) {
                ui.showInvalidOrderNumber();
            } catch (NumberFormatException e) {
                ui.showNonIntegerOrNonNumericOrderIndex();
            }
            break;
        case (Constants.COMMAND_LIST):
            new OrdersListCommand().execute(orderManager);
            break;
        case (Constants.COMMAND_CLEAR):
            try {
                new OrdersClearCommand().execute(ordersArg, itemManager, orderManager);
            } catch (OrderListAlreadyClearedException e) {
                ui.showAlreadyClearedOrderList();
            } catch (WrongOrdersClearCommandException e) {
                ui.showWrongOrdersClearCommand();
            }
            break;
        case (Constants.COMMAND_PRICE):
            try {
                new OrdersPriceCommand().execute(ordersArg, orderManager);
            } catch (EmptyNumberException e) {
                ui.showOrderEmptyNumber();
            } catch (InvalidNumberException e) {
                ui.showInvalidOrderNumber();
            } catch (NumberFormatException e) {
                ui.showNonIntegerOrNonNumericOrderIndex();
            }
            break;
        case (Constants.COMMAND_DONE):
            try {
                logging.writeInfoLevelLog("Orders done command has been inputted by the user to be "
                        + " executed.");
                new OrdersDoneCommand().execute(ordersArg, orderManager);
                logging.writeInfoLevelLog("Orders done command has been successfully executed.");
            } catch (EmptyNumberException e) {
                logging.writeInfoLevelLog("User did not provide order index, orders done command sequence"
                        + " terminated.");
                ui.showOrderEmptyNumber();
            } catch (InvalidNumberException e) {
                logging.writeInfoLevelLog("User provided invalid order index, orders done command sequence"
                        + " terminated.");
                ui.showInvalidOrderNumber();
            } catch (NumberFormatException e) {
                logging.writeInfoLevelLog("User did not provided integer as order index, orders done"
                        + " command sequence terminated.");
                ui.showNonIntegerOrNonNumericOrderIndex();
            }
            break;
        case (Constants.COMMAND_FIND):
            try {
                new OrdersFindCommand().execute(ordersArg, orderManager);
            } catch (EmptyNameException e) {
                ui.showOrderEmptyCustomerName();
            } catch (OrderNotFoundException e) {
                ui.showOrderNotFound();
            }
            break;
        default:
            ui.showOrdersHelp();
        }
    }

    /**
     * Processes the items added to the order.
     *
     * @param customerName         the name of order
     * @param addItemsToOrderInput the item added to the order
     * @param itemManager          item manager
     * @return the items added to order
     */
    public Order processItemsAddedToOrder(String customerName, String addItemsToOrderInput, ItemManager itemManager) {
        logging.writeInfoLevelLog("Processing user input of item_index and item_quantity.");
        ArrayList<Item> itemsAddedToOrder = new ArrayList<>();
        ArrayList<Integer> itemsStockAddedToOrder = new ArrayList<>();
        while (!addItemsToOrderInput.equals("stop") || itemsAddedToOrder.isEmpty()) {
            String[] splitInput = addItemsToOrderInput.split(" ");
            try {
                int itemIndex = Integer.parseInt(splitInput[0]) - Constants.ARRAY_OFFSET;
                int stockAdded = Integer.parseInt(splitInput[1]);
                Item itemToBeAddedToOrder = itemManager.getItem(itemIndex);
                int currentItemStock = itemToBeAddedToOrder.getItemStock();

                itemManager.incrementItemSales(itemToBeAddedToOrder, stockAdded);

                if (stockAdded < 1 || stockAdded > currentItemStock) {
                    throw new InvalidItemStockException();
                }
                int updatedItemStock = currentItemStock - stockAdded;
                itemToBeAddedToOrder.setItemStock(updatedItemStock);
                itemsAddedToOrder.add(itemManager.getItem(itemIndex));
                itemsStockAddedToOrder.add(stockAdded);
                ui.showItemAndStockAddedToOrder(itemToBeAddedToOrder.getItemName(), stockAdded);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                logging.writeInfoLevelLog("User input wrong format, asked to re-input.");
                ui.showInvalidWhileAddingItemToOrder();
            } catch (IndexOutOfBoundsException e) {
                logging.writeInfoLevelLog("Item index inputted not found, asked to re-input.");
                ui.showItemNotFoundWhenAddingToOrder(splitInput[0]);
            } catch (InvalidItemStockException e) {
                logging.writeInfoLevelLog("Invalid item_quantity inputted, asked to re-input or update "
                        + "stock");
                ui.showNotEnoughStock();
            }
            ui.showAddItemsToOrder();
            logging.writeInfoLevelLog("Item and item quantity has been added to the order.");
            addItemsToOrderInput = ui.askForUserInput();
            logging.writeInfoLevelLog("Ask for user input again for more items to be added to the order.");
        }
        logging.writeInfoLevelLog("User has finished adding items to the order.");
        return new Order(customerName, itemsAddedToOrder, itemsStockAddedToOrder);
    }
}