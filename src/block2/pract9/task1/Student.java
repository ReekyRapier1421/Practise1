package block2.pract9.task1;

public class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(String name, int iDNumber, double gpa) {
        this.name=name;
        this.iDNumber=iDNumber;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }
    public int getIDNumber() {
        return iDNumber;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (iDNumber<other.iDNumber) {
            return -1;
        }
        if (iDNumber>other.iDNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return iDNumber+"  "+name+"  ср. балл "+gpa;
    }
}
