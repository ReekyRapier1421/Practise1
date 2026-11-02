package block2.pract9.task1;

public class Sorting {
    public static void insertion(Comparable[] list) {
        for (int i=1; i<list.length; i++) {
            Comparable temp=list[i];
            int j=i-1;
            while (j>=0 && list[j].compareTo(temp)>0) {
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=temp;
        }
    }
}
























