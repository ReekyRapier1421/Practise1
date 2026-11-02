package block2.pract13.task1;

public class Task1 {

    public static void process(String s) {
        System.out.println("Строка "+s);
        System.out.println("Последний символ "+s.charAt(s.length()-1));
        System.out.println("Заканчивается на !!!?  "+s.endsWith("!!!"));
        System.out.println("Начинается с I like  "+s.startsWith("I like"));
        System.out.println("Содержит Java  "+s.contains("Java"));
        System.out.println("Позиция подстроки Java "+s.indexOf("Java"));
        System.out.println("Замена a на o "+s.replace('a', 'o'));
        System.out.println("Верхний регистр "+s.toUpperCase());
        System.out.println("Нижний регистр "+s.toLowerCase());
        int start=s.indexOf("Java");
        System.out.println("Вырезано подстрокой "+s.substring(start, start+4));
    }

    public static void main(String[] args) {
        process("I like Java!!!");
    }
}
