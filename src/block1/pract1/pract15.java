package block1.pract1;

import java.util.Scanner; // импортируем класс

public class pract15 {
    public static void main(String[] args) {
        System.out.println("кол-во аргументов " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println((i+1) +"-ый аргемнет = " + args[i]);
        }
    }
}
