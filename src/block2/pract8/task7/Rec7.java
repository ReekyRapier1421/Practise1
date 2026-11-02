package block2.pract8.task7;
// нет упрощенного алгоритма для этого, чтобы было log(n)
import java.util.Scanner;

public class Rec7 {

    public static void mnzh(int n, int d) {
        if (n==1) {
            return;
        }
        if (d*d>n) {
            System.out.print(n);
            return;
        }
        if (n%d==0) {
            System.out.print(d+" ");
            mnzh(n/d, d);
        } else {
            mnzh(n, d+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите N>1 ");
        int n=sc.nextInt();
        System.out.print("множители: ");
        mnzh(n, 2);
    }
}

