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
}
