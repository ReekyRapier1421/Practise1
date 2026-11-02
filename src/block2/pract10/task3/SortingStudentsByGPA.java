package block2.pract10.task3;

import java.util.Comparator;

class BySurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}

public class SortingStudentsByGPA {

    public static Student[] merge(Student[] a, Student[] b, Comparator<Student> cmp) {
        Student[] result=new Student[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<a.length && j<b.length) {
            if (cmp.compare(a[i], b[j])<=0) {
                result[k]=a[i];
                i++;
            } else {
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length) {
            result[k]=a[i];
            i++;
            k++;
        }
        while (j<b.length) {
            result[k]=b[j];
            j++;
            k++;
        }
        return result;
    }
}
