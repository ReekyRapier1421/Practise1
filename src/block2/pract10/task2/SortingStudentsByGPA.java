package block2.pract10.task2;

import java.util.Comparator;

class ByGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        if (b.getGpa()<a.getGpa()) {
            return -1;
        }
        if (b.getGpa()>a.getGpa()) {
            return 1;
        }
        return 0;
    }
}

class BySurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}

public class SortingStudentsByGPA {

    private Student[] iDNumber;

    public void setArray(Student[] list) {
        iDNumber=list;
    }

    public Student[] getArray() {
        return iDNumber;
    }

    public void outArray() {
        for (int i=0; i<iDNumber.length; i++) {
            System.out.println("  "+iDNumber[i]);
        }
        System.out.println();
    }

    private static int partition(Student[] list, int low, int high, Comparator<Student> cmp) {
        Student pivot=list[high];
        int i=low-1;
        for (int j=low; j<high; j++) {
            if (cmp.compare(list[j], pivot)<0) {
                i++;
                Student tmp=list[i];
                list[i]=list[j];
                list[j]=tmp;
            }
        }
        Student tmp=list[i+1];
        list[i+1]=list[high];
        list[high]=tmp;
        return i+1;
    }

    private static void quickSort(Student[] list, int low, int high, Comparator<Student> cmp) {
        if (low>=high) {
            return;
        }
        int p=partition(list, low, high, cmp);
        quickSort(list, low, p-1, cmp);
        quickSort(list, p+1, high, cmp);
    }

    public void quicksort(Comparator<Student> cmp) {
        quickSort(iDNumber, 0, iDNumber.length-1, cmp);
    }

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

    private static Student[] mergeSort(Student[] list, Comparator<Student> cmp) {
        if (list.length<2) {
            return list;
        }
        int middle=list.length/2;
        Student[] left=new Student[middle];
        Student[] right=new Student[list.length-middle];
        for (int i=0; i<middle; i++) {
            left[i]=list[i];
        }
        for (int i=middle; i<list.length; i++) {
            right[i-middle]=list[i];
        }
        return merge(mergeSort(left, cmp), mergeSort(right, cmp), cmp);
    }

    public void mergesort(Comparator<Student> cmp) {
        iDNumber=mergeSort(iDNumber, cmp);
    }
}
