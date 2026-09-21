package block1.pract6.priceable;

public class TestPriceable {
    public static void main(String[] args) {

        Priceable[] items=new Priceable[5];
        items[0] = new Book("Война и мир", "Лев Николаевич Толстой", 1290.2);
        items[1] = new Phone("Iphone 13ProMax", 512, 2843990.0);
        items[2] = new Ticket("Москва", "Ереван", 17500.0);
        items[3] = new Book("Трое в лодке не считаяя собаки", "Джером Клапка Джером", 24100.0);
        items[4] = new Phone("Xiaomi Redmi 13Ultra", 256, 1523990.0);

        System.out.println("Товары:");
        for (int i=0; i<items.length; i++) {
            System.out.println((i+1)+". "+items[i].getName()+" - "+items[i].getPrice()+" руб.");
        }

        double sum=0;
        for (int i=0; i<items.length; i++) {
            sum += items[i].getPrice();
        }
        System.out.println("Общая стоимость: "+sum+" руб.");

        Priceable max=items[0];
        for (int i=1; i<items.length; i++) {
            if (items[i].getPrice()>max.getPrice()) {
                max = items[i];
            }
        }
        System.out.println("Самый дорогой: "+max.getName()+" - "+max.getPrice()+" руб.");
    }
}
