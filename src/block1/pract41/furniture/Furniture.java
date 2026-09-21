package block1.pract41.furniture;

public abstract class Furniture {
    protected String name;
    protected double price;
    protected String fabrics;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.fabrics = material;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return fabrics;
    }

    public abstract String getType();

    public abstract double getArea();

    @Override
    public String toString() {
        return getType() + " " + name + ", " + fabrics + ", " + price + " руб., " + getArea() + " кв.м";
    }
}
