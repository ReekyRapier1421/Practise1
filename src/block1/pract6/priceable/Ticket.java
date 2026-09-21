package block1.pract6.priceable;

public class Ticket implements Priceable {
    private String from;
    private String to;
    private double price;

    public Ticket(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Билет " + from + " - " + to;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Билет " + from + " - " + to;
    }
}
