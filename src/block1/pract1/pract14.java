package block1.pract1;

import java.util.Scanner; // импортируем класс


public class pract14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        int[] bdowhile = new int[n];
        int[] bwhile = new int[n];


        int sumdo=bdowhile[0];
        int mindo=0;
        int maxdo=0;

        int i = 0;
        do {
            System.out.print("введите " + (i+1) + "-ый элемент первого массива");
            bdowhile[i] = sc.nextInt();
            sumdo += bdowhile[i];
            mindo=bdowhile[0];
            maxdo=bdowhile[0];
            if (bdowhile[i] > maxdo) maxdo = bdowhile[i];
            if (bdowhile[i] < mindo) mindo = bdowhile[i];
            i++;

        } while (i < n);

        int sumwhile=0;
        int minwhile=0;
        int maxwhile=0;

        i = 0;
        while (i<n)
        {
            System.out.print("введите " + (i+1) + "-ый элемент второго массива");
            bwhile[i] = sc.nextInt();
            sumwhile += bwhile[i];
            minwhile=bwhile[0];
            maxwhile=bwhile[0];
            if (bwhile[i] > maxwhile) maxwhile = bwhile[i];
            if (bwhile[i] < minwhile) minwhile = bwhile[i];
            i++;
        }

        System.out.println("максимальный элемент dowhile = " + maxdo);
        System.out.println("минимальный элемент dowhile = " + mindo);
        System.out.println("сумма элементов dowhile = "+ sumdo);

        System.out.println("максимальный элемент while = " + maxwhile);
        System.out.println("минимальный элемент while = " + minwhile);
        System.out.println("сумма элементов while = " + sumwhile);












    }
}






