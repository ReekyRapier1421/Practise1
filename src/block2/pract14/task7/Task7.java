package block2.pract14.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    private static final String REGEX="(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}";

    public static String isStrong(String password) {
        Pattern p=Pattern.compile(REGEX);
        Matcher m=p.matcher(password);
        if(m.matches()){
            return "надёжный";
        }
        else{
            return "ненадёжный";
        }
    }

    public static void main(String[] args) {

        String[] tests={
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "Qwerty12",
                "Qwerty_1",
                "ПарольАбв1"
        };

        for (int i=0; i<tests.length; i++) {
            System.out.println(tests[i]+" "+(isStrong(tests[i])));
        }
    }
}
