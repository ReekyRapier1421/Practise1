package block2.pract11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("День: ");
        int day=sc.nextInt();
        System.out.print("Месяц: ");
        int month=sc.nextInt();
        System.out.print("Год: ");
        int year=sc.nextInt();


        Calendar cal=Calendar.getInstance();
        cal.set(year, month-1, day, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date entered=cal.getTime();

        Calendar today=Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        Date now=today.getTime();

        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("введено с клавиатуры "+sdf.format(entered));
        System.out.println("сегодня              "+sdf.format(now));

        if (entered.before(now)) {
            System.out.println("Введённая дата раньше");
        } else if (entered.after(now)) {
            System.out.println("Введённая дата позже");
        } else {
            System.out.println("Даты совпадают");
        }
    }
}
