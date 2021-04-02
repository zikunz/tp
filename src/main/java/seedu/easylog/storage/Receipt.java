package seedu.easylog.storage;

import seedu.easylog.common.Messages;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Deals with receipt related features.
 */
public class Receipt extends Storage {

    public static int receiptCounter = 1;

    /**
     * Generate a receipt file in .txt format.
     * @param orderIndex order index of order to generate the order details into a receipt.
     * @param orderManager manipulate orders.
     * @throws IOException when there is an error while creating the file for the receipt.
     */
    public void generateReceipt(int orderIndex, OrderManager orderManager) throws IOException {
        String customerName = orderManager.getCustomerName(orderIndex);
        ui.showGeneratingReceipt(customerName);
        File receiptDirectory = new File("Receipts");
        if (!receiptDirectory.exists()) { // if the directory does not exist
            receiptDirectory.mkdir();
        }
        String receiptName = customerName + receiptCounter;
        String receiptFilePath = "Receipts/" + receiptName + ".txt";
        File receipt = new File(receiptFilePath);
        receipt.createNewFile();
        FileWriter fw = new FileWriter(receiptFilePath);
        Order orderToAddToReceipt = orderManager.getOrder(orderIndex);
        fw.write(ui.showReceiptHeader());
        fw.write(orderManager.getIndividualOrderPrintFormat(orderToAddToReceipt));
        fw.close();
        ui.showReceiptGenerated(customerName);
        ++receiptCounter;
    }

    /**
     * Set the receipt counter from save file to ensure consistency.
     * @param receiptCount receipt count obtained from save file.
     */
    public void setReceiptCounter(int receiptCount) {
        receiptCounter = receiptCount;
    }
}
