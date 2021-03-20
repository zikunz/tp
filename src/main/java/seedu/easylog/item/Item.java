package seedu.easylog.item;

/**
 * Handles Item related information.
 */
public class Item {

    protected String itemName;
    protected String itemPrice;
    protected String itemStock;

    public Item(String itemName, String price, String stock) {
        this.itemName = itemName;
        this.itemPrice = price;
        this.itemStock = stock;
        assert itemName != null;
    }

    public String getItemName() {
        return itemName;
    }

    /**
     * Returns the item price of a particular item.
     *
     * @return item price
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * Returns the item stock of a particular item.
     *
     * @return item stock
     */
    public String getItemStock() {
        return itemStock;
    }

    public String getAddItemMessage() {
        return "Got it! The item [" + itemName + "] is added.";
    }

    public String getDeleteItemMessage() {
        return "Got it! The item [" + itemName + "] is deleted.";
    }

    /**
     * Sets the price of an item of interest.
     */
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
}
