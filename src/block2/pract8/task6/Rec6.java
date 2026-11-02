package block2.pract8.task6;

import java.util.Scanner;

public class Rec6 {

    public static boolean prime(int n, int d) {
        if (d*d>n) {
            return true;
        }
        if (n%d==0) {
            return false;
        }
        return prime(n, d+1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите натуральное число больше 1: ");
        int n=sc.nextInt();
        if (prime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

//sqrt(n)



}
