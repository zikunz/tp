package seedu.easylog.parser;

import seedu.easylog.commands.orderscommands.*;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.OrderEmptyException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.exceptions.InvalidItemStockException;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import seedu.easylog.order.Order;
import seedu.easylog.order.OrderManager;

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
                new OrdersAddCommand().execute(ordersArg, itemManager, orderManager);
            } catch (EmptyNameException e) {
                ui.showOrderEmptyCustomerName();
            } catch (EmptyItemListException e) {
                ui.showEmptyItemList();
                ui.showAddItemFirst();
            } catch (OrderEmptyException e) {
                ui.showOrderEmpty();
            } catch (NumberFormatException e) {
                ui.showInvalidStopAddingItemToOrder();
            } catch (ArrayIndexOutOfBoundsException e) {
                ui.showInvalidFormatOrdersAdd();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new OrdersDeleteCommand().execute(ordersArg, orderManager);
            } catch (EmptyNumberException e) {
                ui.showOrderEmptyNumber();
            } catch (InvalidNumberException e) {
                ui.showInvalidOrderNumber();
            } catch (NumberFormatException e) {
                ui.showNonIntegerOrderNumber();
            }
            break;
        case (Constants.COMMAND_LIST):
            new OrdersListCommand().execute(orderManager);
            break;
        case (Constants.COMMAND_CLEAR):
            try {
                new OrdersClearCommand().execute(orderManager);
            } catch (OrderListAlreadyClearedException e) {
                ui.showAlreadyClearedOrderList();
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
                ui.showNonIntegerOrderNumber();
            }
            break;
        case (Constants.COMMAND_SHIP):
            try {
                new OrdersShipCommand().execute(ordersArg, orderManager);
            } catch (EmptyNumberException e) {
                ui.showOrderEmptyNumber();
            } catch (InvalidNumberException e) {
                ui.showInvalidOrderNumber();
            } catch (NumberFormatException e) {
                ui.showNonIntegerOrderNumber();
            }
            break;
        case (Constants.COMMAND_FIND):
            try {
                new OrdersFindCommand().execute(ordersArg, orderManager);
            } catch (EmptyNameException e) {
                ui.showItemEmptyName();
            }
            break;
        default:
            ui.showOrdersHelp();
        }
    }

    public Order processItemsAddedToOrder(String customerName, String addItemsToOrderInput, ItemManager itemManager)
            throws OrderEmptyException {
        ArrayList<Item> itemsAddedToOrder = new ArrayList<>();
        ArrayList<Integer> itemsStockAddedToOrder = new ArrayList<>();
        do {
            String[] splitInput = addItemsToOrderInput.split(" ");
            int itemIndex = Integer.parseInt(splitInput[0]) - Constants.ARRAY_OFFSET;
            int stockAdded = Integer.parseInt(splitInput[1]);
            try {
                Item itemToBeAddedToOrder = itemManager.getItem(itemIndex);
                int currentItemStock = itemToBeAddedToOrder.getItemStock();
                if (stockAdded < 0 || stockAdded > currentItemStock) {
                    throw new InvalidItemStockException();
                }
                int updatedItemStock = currentItemStock - stockAdded;
                itemToBeAddedToOrder.setItemStock(updatedItemStock);
                itemsAddedToOrder.add(itemManager.getItem(itemIndex));
                itemsStockAddedToOrder.add(stockAdded);
                ui.showItemAndStockAddedToOrder(itemToBeAddedToOrder.getItemName(), stockAdded);
            } catch (IndexOutOfBoundsException e) {
                ui.showItemNotFound(itemIndex);
            } catch (InvalidItemStockException e) {
                ui.showNotEnoughStock();
            }
            ui.showContinueAddingItemsToOrder();
            addItemsToOrderInput = Constants.SCANNER.nextLine();
        } while (!addItemsToOrderInput.equals("stop"));
        if (itemsAddedToOrder.isEmpty()) {
            throw new OrderEmptyException();
        }
        return new Order(customerName, itemsAddedToOrder, itemsStockAddedToOrder);
    }


}
