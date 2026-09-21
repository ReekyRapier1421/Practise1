package block1.pract6.priceable;

public class Book implements Priceable {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Книга \"" + title + "\"";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Книга \"" + title + "\", " + author;
    }
}
