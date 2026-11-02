package block2.pract8.task6;

import java.util.Random;
import java.util.Scanner;

public class Rec6Ferma {

    private static final Random rnd=new Random();

    //мл теорема ферма
    public static long Pow(long a, long e, long m) {
        if (e==0) {
            return 1;
        }

        long half=Pow(a, e/2, m);
        long res=half*half%m;

        if (e%2==1) {
            res=res*a%m;
        }
        return res;
    }

    public static long NOD(long a, long b) {
        if (b==0) {
            return a;
        }
        return NOD(b, a%b);
    }


    public static boolean check(long x, int attemp) {
        if (attemp==0) {
            return true;
        }

        long a=2+(long)(rnd.nextDouble()*(x-2));
        if (NOD(a, x)!=1) {
            return false;
        }


        if (Pow(a, x-1, x)!=1) {
            return false;
        }
        return check(x, attemp-1);
    }

    public static boolean ferma(long x) {
        if (x<2) {
            return false;
        }
        if (x==2 || x==3) {
            return true;
        }
        if (x%2==0) {
            return false;
        }
        return check(x, 100);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Введите натуральное число больше 1: ");
        long n=sc.nextLong();
        System.out.println(ferma(n) ? "YES" : "NO");
    }
}
//log(n)

