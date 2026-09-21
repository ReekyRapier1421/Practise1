package block1.pract7.printable;

public class Book implements Printable {
    private String name;
    private String author;
    private int symbols;

    public Book(String name, String author, int symbols) {
        this.name=name;
        this.author=author;
        this.symbols=symbols;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Книга "+name+", автор "+author+", символов: "+symbols);
    }
}
