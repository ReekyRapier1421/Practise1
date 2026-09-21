package block1.pract7.printable;

public class TestPrintable {
    public static void main(String[] args) {

        Printable[] items=new Printable[5];
        items[0]=new Book("Война и мир", "Толстой", 3215000);
        items[1]=new Magazine("times", 312);
        items[2]=new Book("Муму", "Тургенев", 412000);
        items[3]=new Magazine("Дискавери", 71);
        items[4]=new Book("Идеальный программист", "Шилдт", 980000);

        System.out.println("Всё");
        for (int i=0; i<items.length; i++) {
            items[i].print();
        }

        System.out.println();
        System.out.println("Журныли");
        Magazine.printMagazines(items);
    }
}
