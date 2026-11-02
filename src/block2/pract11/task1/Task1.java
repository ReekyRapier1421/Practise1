package block2.pract11.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date received=new Date(System.currentTimeMillis()-3*24*60*60*1000L);
        Date passed=new Date();

        System.out.println("Разработал: Гарибян Э.А.");
        System.out.println("Задание получено "+sdf.format(received));
        System.out.println("Задание сдано    "+sdf.format(passed));

        long days=(passed.getTime()-received.getTime())/(24*60*60*1000L);
        System.out.println("за "+days+" дня");
    }
}
