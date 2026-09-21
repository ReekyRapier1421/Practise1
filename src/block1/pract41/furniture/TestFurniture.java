package block1.pract41.furniture;

public class TestFurniture {
    public static void main(String[] args) {
        FurnitureShop shop=new FurnitureShop();

        shop.add(new Table("Кухонный", 12311, "дуб", 0.9, 1.6, 0.75, 6));
        shop.add(new Table("Письменный", 8442, "дсп", 0.6, 1.2, 0.73, 1));
        shop.add(new Chair("Табуретка", 3333, "дуб", 0.45));
        shop.add(new Chair("Офисный", 5440, "лен", 0.5));
        shop.add(new Sofa("Стильный", 42000, "железо", 1.6, 2.4, 4));

        System.out.println("Мебель в магазине:");
        shop.printl();

        System.out.println("Общая стоимость: "+shop.Price()+" руб.");

        System.out.println("Поиск по типу Стул:");
        shop.search("Стул");

        System.out.println("Поиск по типу Шкаф:");
        shop.search("Шкаф");
    }
}
