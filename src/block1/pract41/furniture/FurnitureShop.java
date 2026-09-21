package block1.pract41.furniture;

public class FurnitureShop {
    private Furniture[] items=new Furniture[50];
    private int count=0;

    public void add(Furniture f) {
        items[count] = f;
        count++;
    }

    public void printl() {
        for (int i=0; i<count; i++) {
            System.out.println((i+1)+"-"+items[i]);
        }
    }

    public double Price() {
        double sum=0;
        for (int i=0; i<count; i++) {
            sum += items[i].getPrice();
        }
        return sum;
    }


    public void search(String type) {
        boolean found=false;
        for (int i=0; i<count; i++) {
            if (items[i].getType().equalsIgnoreCase(type))
            {
                System.out.println(items[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("такой мебели нет");
        }
    }
}
