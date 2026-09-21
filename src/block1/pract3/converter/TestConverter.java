package block1.pract3.converter;

import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        Converter conv=new Converter();

        Scanner sc=new Scanner(System.in);
        conv.Rates();

        System.out.print("\nВведите колво валюты: ");
        double amount=sc.nextDouble();

        System.out.print("из какой переводим: ");
        String from=sc.next();

        System.out.print("куда переводим: ");
        String to=sc.next();

        if (conv.index(from)<0 || conv.index(to)<0) {
            System.out.println("неизвестная валюты");
            return;
        }

        double result=conv.convert(amount, from, to);

        System.out.println(conv.format(amount, from)+"  =  "+conv.format(result, to));

    }
}
