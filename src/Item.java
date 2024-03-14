public abstract class Item {
    public String nameItem;
    private String descriptionItem;

    protected String ID_Item;

    float priceItem;

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }
    public void Item (String nameItem, String descriptionItem, String ID_Item, float priceItem) {
        this.nameItem = nameItem;
        this.descriptionItem = descriptionItem;
        this.ID_Item = ID_Item;
        this.priceItem = priceItem;
    }
}
