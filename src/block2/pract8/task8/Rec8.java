package block2.pract8.task8;

import java.util.Scanner;

public class Rec8 {

    public static boolean palindrome(String s, int left, int right) {
        if (left>=right) {
            return true;
        }

        if (s.charAt(left)!=s.charAt(right)) {
            return false;
        }

        return palindrome(s, left+1, right-1);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("проверить на полиндром- ");
        String w=sc.next();
        if (palindrome(w, 0, w.length()-1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
