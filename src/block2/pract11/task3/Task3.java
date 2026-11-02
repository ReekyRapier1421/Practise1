package block2.pract11.task3;

import java.text.DateFormat;
import java.util.Calendar;

public class Task3 {
    public static void main(String[] args) {

        Calendar cal=Calendar.getInstance();

        cal.set(1980, Calendar.NOVEMBER, 14);
        Student s1=new Student(1025, "Эдмон", "Гарибян", "КВБО-11-25", cal.getTime());

        System.out.println("  "+s1);

        System.out.println("\nДата рождения студента во всех форматах");
        System.out.println("короткий: "+s1.birthDateAs(DateFormat.SHORT));
        System.out.println("средний:  "+s1.birthDateAs(DateFormat.MEDIUM));
        System.out.println("длинный:  "+s1.birthDateAs(DateFormat.LONG));
        System.out.println("полный:   "+s1.birthDateAs(DateFormat.FULL));
    }
}
