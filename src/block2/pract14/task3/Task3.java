package block2.pract14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final String REGEX="(?<![\\d.])\\d+(\\.\\d{1,2})?\\s+(USD|RUB|EU)\\b";

    public static void findPrices(String text) {
        Pattern p=Pattern.compile(REGEX);
        Matcher m=p.matcher(text);
        while (m.find()) {
            System.out.println("найдено "+m.group()+" валюта "+m.group(2));
        }
    }

    public static void main(String[] args) {

        String text="клавиатура 25.98 USD, мышь 1500 RUB, "
                +"коврик 44 ERR, наушники 0.004 EU, монитор 199.99 EU, "
                +"колонки 3500.50 RUB";

        System.out.println(text);
        System.out.println("Извлечённые цены");
        findPrices(text);
    }
}
