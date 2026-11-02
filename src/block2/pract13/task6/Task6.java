package block2.pract13.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {

    private static String[] words;
    private static boolean[] used;
    private static String[] chain;

    private static boolean build(int position) {
        if (position==words.length) {
            return true;
        }
        String previous=chain[position-1];
        char last=Character.toLowerCase(previous.charAt(previous.length()-1));
        for (int i=0; i<words.length; i++) {
            if (used[i]) {
                continue;
            }
            char first=Character.toLowerCase(words[i].charAt(0));
            if (first==last) {
                used[i]=true;
                chain[position]=words[i];
                if (build(position+1)) {
                    return true;
                }
                used[i]=false;
            }
        }
        return false;
    }

    public static String getLine() {
        used=new boolean[words.length];
        chain=new String[words.length];
        for (int i=0; i<words.length; i++) {
            used[i]=true;
            chain[0]=words[i];
            if (build(1)) {
                StringBuilder sb=new StringBuilder();
                for (int j=0; j<chain.length; j++) {
                    if (j>0) {
                        sb.append(" ");
                    }
                    sb.append(chain[j]);
                }
                return sb.toString();
            }
            used[i]=false;
        }
        return "цепочка невозможна";
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(System.in);
        System.out.print("Имя файла ");
        String name=sc.next();

        File file=new File(name);
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }

        StringBuilder text=new StringBuilder();
        Scanner fileScanner=new Scanner(file);
        while (fileScanner.hasNext()) {
            text.append(fileScanner.next()).append(" ");
        }
        fileScanner.close();

        words=text.toString().trim().split("\\s+");

        System.out.println("файл "+text.toString().trim());
        System.out.println("цепочка "+getLine());
    }
}
//src/block2/pract13/task6/testtt.txt