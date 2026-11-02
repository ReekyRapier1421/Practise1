package block2.pract14.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final String REGEX="abcdefghijklmnopqrstuv18340";

    public static boolean check(String s) {
        Pattern p=Pattern.compile(REGEX);
        Matcher m=p.matcher(s);
        return m.matches();
    }

    public static void main(String[] args) {

        String[] tests={
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340",
                "abcdefghijklmnopqrstuv1834",
                "ABCDEFGHIJKLMNOPQRSTUV18340"
        };

        for (int i=0; i<tests.length; i++) {
            System.out.println(tests[i]+" "+(check(tests[i]) ? "да" : "нет"));
        }
    }
}
