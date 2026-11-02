package block2.pract10.task2;

public class Test2 {
    public static void main(String[] args) {

        SortingStudentsByGPA shop=new SortingStudentsByGPA();

        shop.setArray(new Student[]{
                new Student(111111, "Эдмон", "уекппуп", "укпцукцкп", 2, "КВБО-11-25", 4.2),
                new Student(234234, "цукйцуа ", "цкиеник", "кеинние", 1, "КВБО-03-25", 3.6),
                new Student(32423, "ук ак ", "киеунеие", "икениек", 2, "КВБО-11-25", 4.9),
                new Student(14314, "фукафук", "фу каук ", "гшнл", 3, "КВБО-07-24", 4.5),
                new Student(88888, "кнеге ", "фу ка ", "фмфуммы", 1, "КВБО-03-25", 3.1)
        });

        System.out.println("Исходный массив");
        shop.outArray();

        shop.quicksort(new ByGpaComparator());
        System.out.println("quicksort по среднему баллу");
        shop.outArray();

        shop.mergesort(new BySurnameComparator());
        System.out.println("слияние по фамилии");
        shop.outArray();
    }
}
