package block2.pract8.task9;

import java.util.Scanner;

public class Rec9 {

    public static int count(int a, int b, boolean last0) {
        if (a==0 && b==0) {
            return 1;
        }


        int summ=0;

        if (b>0) {
            summ+=count(a, b-1, false);
        }

        if (a>0 && !last0) {
            summ+=count(a-1, b, true);
        }

        return summ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("кол-во 0 ");
        int a=sc.nextInt();
        System.out.print("кол-во 1 ");
        int b=sc.nextInt();
        System.out.println("кол-во сочетаний "+count(a, b, false));
    }
}
