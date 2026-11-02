package block2.pract9.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa()>b.getGpa())
            return -1;
        else if (a.getGpa()<b.getGpa())
            return 1;
        else
            return 0;
    }

    public static void quickSort(Student[] list, int low, int high, Comparator<Student> cmp) {
        if (low>=high) {
            return;
        }

        Student p=list[high];
        int i=low-1;

        for (int j=low; j<high; j++) {
            if (cmp.compare(list[j], p)<0) {
                i++;
                Student t=list[i];
                list[i]=list[j];
                list[j]=t;
            }
        }

        Student t=list[i+1];
        list[i+1]=list[high];
        list[high]=t;

        quickSort(list, low, i, cmp);
        quickSort(list, i+2, high, cmp);
    }
}
