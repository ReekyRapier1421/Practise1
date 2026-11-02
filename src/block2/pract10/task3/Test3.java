package block2.pract10.task3;

public class Test3 {
    public static void main(String[] args) {

        Student[] first={
                new Student(2001, "а3сейесц3", "аапрап", "Информатика", 1, "КВБО-01-26", 4.8),
                new Student(2004, "бцсес45сец", "гонгно", "Информатика", 1, "КВБО-01-26", 3.9),
                new Student(2007, "вцс45ецс54", "апрап", "Информатика", 1, "КВБО-01-26", 4.1)
        };

        Student[] second={
                new Student(3002, "гысепыс", "ыскепсыке", "Экономика", 2, "КЭБО-02-25", 4.4),
                new Student(3005, "дыкепыс", "аигооа", "Экономика", 2, "КЭБО-02-25", 3.5)
        };



        System.out.println("\nсписок1");
        for (int i=0; i<first.length; i++) {
            System.out.println("  "+first[i]);
        }
        System.out.println();

        System.out.println("\nсписок2");
        for (int i=0; i<second.length; i++) {
            System.out.println("  "+second[i]);
        }


        Student[] all=SortingStudentsByGPA.merge(first, second, new BySurnameComparator());

        System.out.println("объединенный список:");
        for (int i=0; i<all.length; i++) {
            System.out.println("  "+all[i]);
        }
    }
}
