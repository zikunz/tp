package seedu.easylog.storage;

import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Receipt extends Storage {

    public static int receiptCounter;

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
        fw.write(orderManager.getIndividualOrderPrintFormat(orderToAddToReceipt));
        fw.close();
        ui.showReceiptGenerated(customerName);
        ++receiptCounter;
    }

    public void setReceiptCounter(int receiptCount) {
        receiptCounter = receiptCount;
    }
}
