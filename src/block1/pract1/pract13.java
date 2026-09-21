package block1.pract1;

import java.util.Scanner; // импортируем класс


public class pract13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] b = {1,2,3,4,5,6};

        int c = 0;
        double z = 0;
        for(int i=0;i<b.length;i++)
        {
            c+=b[i];
            z=(double) c/b.length;
        }
        System.out.println("реднее арифметическое: "+ z);
        System.out.println("сумма чисел масива: "+ c);
    }
}






