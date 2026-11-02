package block2.pract11.task3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private int iDNumber;
    private String name;
    private String surname;
    private String group;
    private Date birthDate;

    public Student(int iDNumber, String name, String surname, String group, Date birthDate) {
        this.iDNumber=iDNumber;
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.birthDate=birthDate;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate=birthDate;
    }

    public String birthDateAs(int style) {
        DateFormat df=DateFormat.getDateInstance(style, Locale.forLanguageTag("ru-RU"));
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return iDNumber+"  "+surname+" "+name+"  "+group+"  дата рождения: "+birthDateAs(DateFormat.MEDIUM);
    }
}
