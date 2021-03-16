package seedu.easylog.item;

/**
 * Handles Item related information.
 */
public class Item {

    protected String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
        assert itemName != null;
    }

    public String getItemName() {
        return itemName;
    }

    public String getAddItemMessage() {
        return "Got it! The item [" + itemName + "] is added.";
    }

    public String getDeleteItemMessage() {
        return "Got it! The item [" + itemName + "] is deleted.";
    }
}
