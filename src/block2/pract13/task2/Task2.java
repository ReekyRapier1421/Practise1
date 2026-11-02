package block2.pract13.task2;

public class Task2 {
    public static void main(String[] args) {

        Person[] people={
                new Person("Гарибян", "Эдмонд", "Арменович"),
                new Person("укуку", "прпрапр", null),
                new Person("шдгл", "", "кеукеук"),
                new Person("пвпвап", null, ""),
                new Person("смисмисм", "ллолд", "Петрович")
        };

        for (int i=0; i<people.length; i++) {
            System.out.println(people[i].getShortName());
        }
    }
}
