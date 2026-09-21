package block1.pract7.printable;

public class Magazine implements Printable {
    private String name;
    private int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Журнал "+name+", выпуск "+number);
    }

    public static void printMagazines(Printable[] printable) {
        for (int i=0; i<printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                Magazine m=(Magazine) printable[i];
                System.out.println(m.getName()+", выпуск "+m.number);
            }
        }
    }
}
