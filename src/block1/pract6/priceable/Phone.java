package block1.pract6.priceable;

public class Phone implements Priceable {
    private String model;
    private int memory;
    private double price;

    public Phone(String model, int memory, double price) {
        this.model = model;
        this.memory = memory;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Телефон " + model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Телефон " + model + ", " + memory + " Гб";
    }
}
