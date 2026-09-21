package block1.pract2.pract29;

import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] shirt={"пик", "червей", "бубен", "треф"};

        String[] deck=new String[52];
        int k=0;
        for (int i=0; i<shirt.length; i++)
        {
            for (int j=0; j<ranks.length; j++)
            {
                deck[k] = ranks[j] + " " + shirt[i];
                k++;
            }
        }

        Random r=new Random();
        for (int i=51; i>0; i--)
        {
            int j=r.nextInt(i + 1);
            String t=deck[i];
            deck[i] = deck[j];
            deck[j] = t;
        }

        Scanner s=new Scanner(System.in);
        System.out.print("Введите колво игроков:");
        int n=s.nextInt();

        if (n<1 || n * 5>52) {
            System.out.println("Нельзя раздать карты на, игроков не верное число");
            return;
        }


        int card=0;
        for (int player=1; player<=n; player++) {
            System.out.println("Игрок "+player+":");
            for (int i=0; i<5; i++) {
                System.out.println("  "+deck[card]);
                card++;
            }
            System.out.println();
        }
    }
}
