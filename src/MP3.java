public class MP3 extends Item{
    public double duration;


    public MP3(String nameItem, String descriptionItem, String ID_Item, float priceItem, double duration) {
        super(nameItem, descriptionItem, ID_Item, priceItem);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void showInFo() {
        System.out.println("nameItem:" + getNameItem());
        System.out.println("descriptionItem:" + getDescriptionItem());
        System.out.println("ID_Item:" + ID_Item);
        System.out.println("price:" + priceItem);
        System.out.println("duration" + duration);
    }


}
