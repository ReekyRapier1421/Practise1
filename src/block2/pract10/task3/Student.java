package block2.pract10.task3;

public class Student {
    private int iDNumber;
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private double gpa;

    public Student(int iDNumber, String name, String surname, String speciality, int course, String group, double gpa) {
        this.iDNumber=iDNumber;
        this.name=name;
        this.surname=surname;
        this.speciality=speciality;
        this.course=course;
        this.group=group;
        this.gpa=gpa;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber=iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality=speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course=course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group=group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return iDNumber+"  "+surname+" "+name+"  "+speciality+"  "+course+" курс  "+group+"  балл "+gpa;
    }
}
