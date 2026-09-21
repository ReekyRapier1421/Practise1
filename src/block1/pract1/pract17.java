package block1.pract1;

import java.util.Scanner; // импортируем класс

public class pract17 {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("число должно быть неотрицательным");
            return -1;
        }
        if (n > 20) {
            System.out.println("число лишком большое, происходит переполнение");
            return -1;
        }



        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите число с которого хотите брать факториал");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}
