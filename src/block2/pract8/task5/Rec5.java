
package block2.pract8.task5;

import java.util.Scanner;

public class Rec5 {

    public static int Summ(int n) {
        if (n<10) {
            return n;
        }
        return n%10+Summ(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите число ");
        int n=sc.nextInt();
        System.out.println("Сумма цифр числа= "+Summ(n));
    }
}
