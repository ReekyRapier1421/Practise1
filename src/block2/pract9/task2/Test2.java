package block2.pract9.task2;

public class Test2 {
    public static void main(String[] args) {

        Student[] students={
                new Student("б б", 1043, 4.2),
                new Student("К К ", 1007, 3.6),
                new Student("Гарибян Эдмон", 1025, 4.9),
                new Student("В В", 1012, 4.5),
                new Student("М М", 1031, 3.1)
        };

        System.out.println("массив без сортировки");
        for (int i=0; i<students.length; i++) {
            System.out.println("  "+students[i]);
        }

        SortingStudentsByGPA cmp=new SortingStudentsByGPA();
        SortingStudentsByGPA.quickSort(students, 0, students.length-1, cmp);
        System.out.println("\nбыстрая сортировка");
        for (int i=0; i<students.length; i++) {
            System.out.println("  "+students[i]);
        }
    }
}
