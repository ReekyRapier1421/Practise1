package block1.pract41.furniture;

public class Sofa extends Furniture {
    private double w;
    private double l;
    private int seats;

    public Sofa(String name, double price, String fabric, double w, double l, int seats) {
        super(name, price, fabric);
        this.w = w;
        this.l = l;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String getType() {
        return "Диван";
    }

    @Override
    public double getArea() {
        return w * l;
    }

    @Override
    public String toString() {
        return super.toString() + ", мест: " + seats;
    }
}
