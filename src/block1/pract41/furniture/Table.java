package block1.pract41.furniture;

public class Table extends Furniture {
    private double w;
    private double l;
    private double h;
    private int seats;

    public Table(String name, double price, String fabric, double w, double l, double h, int seats) {
        super(name, price, fabric);
        this.w = w;
        this.l = l;
        this.h = h;
        this.seats = seats;
    }

    public double getHeight() {
        return h;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String getType() {
        return "Стол";
    }

    @Override
    public double getArea() {
        return w * l;
    }

    @Override
    public String toString() {
        return super.toString() + ", высота: " + h + " м, мест: " + seats;
    }
}
