package block2.pract11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Год ");
        int year=sc.nextInt();
        System.out.print("Месяц ");
        int month=sc.nextInt();
        System.out.print("Число ");
        int day=sc.nextInt();
        System.out.print("Часы ");
        int hour=sc.nextInt();
        System.out.print("Минуты ");
        int minute=sc.nextInt();

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);

        Date date=cal.getTime();

        SimpleDateFormat sdf=new SimpleDateFormat("EEEE, dd MMMM yyyy, HH:mm");

        System.out.println("\nDate: "+date);
        System.out.println("Calendar: "+sdf.format(cal.getTime()));
    }
}
