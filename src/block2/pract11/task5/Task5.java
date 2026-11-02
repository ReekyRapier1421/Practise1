package block2.pract11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    private static final int N=100000;

    public static void test(String title, List<Integer> list) {

        long start=System.currentTimeMillis();

        for (int i=0; i<N; i++) {
            list.add(i);
        }


        long add=System.currentTimeMillis()-start;
        start=System.currentTimeMillis();
        for (int i=0; i<2000; i++) {
            list.add(0, i);
        }
        long insert=System.currentTimeMillis()-start;

        start=System.currentTimeMillis();
        for (int i=0; i<2000; i++) {
            list.remove(0);
        }
        long remove=System.currentTimeMillis()-start;

        start=System.currentTimeMillis();
        for (int i=0; i<2000; i++) {
            list.get(i*20);
        }
        long get=System.currentTimeMillis()-start;

        start=System.currentTimeMillis();
        for (int i=0; i<200; i++) {
            list.indexOf(N-1);
        }
        long search=System.currentTimeMillis()-start;

        System.out.println(title+"добавление в конец "+add+" мс");
        System.out.println(title+"вставка в начало   "+insert+" мс");
        System.out.println(title+"удаление из начала "+remove+" мс");
        System.out.println(title+"доступ по индексу  "+get+" мс");
        System.out.println(title+"поиск по значению  "+search+" мс");
        System.out.println();
    }

    public static void main(String[] args) {


        test("ArrayList ", new ArrayList<Integer>());
        test("LinkedList", new LinkedList<Integer>());
    }
}
