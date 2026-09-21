package block1.pract2.pract24;

public class Computer {
private String brand;
private double price;

public Computer(String brand, double price) {
    this.brand = brand;
    this.price = price;
}


public String getBrand() {
    return brand;
}

@Override
public String toString() {
    return brand + " стоит " + price + " руб.";
}
}
