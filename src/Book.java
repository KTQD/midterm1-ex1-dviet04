public class Book extends Item{
    public String autor;
    public int numberOfPages;
    public String genre;

    public Book(String nameItem, String descriptionItem, String ID_Item, float priceItem, String autor, int numberOfPages, String genre) {
        super(nameItem, descriptionItem, ID_Item, priceItem);
        this.autor = autor;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void showInFo() {
        System.out.println("nameItem:" + getNameItem());
        System.out.println("descriptionItem:" + getDescriptionItem());
        System.out.println("ID_Item:" + ID_Item);
        System.out.println("autor:" + autor);
        System.out.println("numberOfPages:" + numberOfPages);
        System.out.println("genre:" + genre);

    }
}
