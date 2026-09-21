package block1.pract41.furniture;

public class Chair extends Furniture {
    private double s;

    public Chair(String name, double price, String material, double s) {
        super(name, price, material);
        this.s = s;
    }

    @Override
    public String getType() {
        return "Стул";
    }

    @Override
    public double getArea() {
        return s * s;
    }
}
