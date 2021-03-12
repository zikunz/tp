package seedu.easylog.item;

public class Item {

    protected String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
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
