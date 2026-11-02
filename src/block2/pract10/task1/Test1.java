package block2.pract10.task1;

public class Test1 {
    public static void main(String[] args) {

        Student s=new Student(6767, "Эдмонд", "Гарибян", "много букв", 2, "КВБО-11-25", 4.9);

        System.out.println("Студент создан конструктором:");
        System.out.println("  "+s);

        System.out.println("\nЧтение полей геттерами:");
        System.out.println("  номер: "+s.getIDNumber());
        System.out.println("  имя: "+s.getName());
        System.out.println("  фамилия: "+s.getSurname());
        System.out.println("  специальность: "+s.getSpeciality());
        System.out.println("  курс: "+s.getCourse());
        System.out.println("  группа: "+s.getGroup());
        System.out.println("  средний балл: "+s.getGpa());

        s.setCourse(3);
        s.setGroup("КВБО-11-25");
        s.setGpa(5.0);

        System.out.println("\n "+s);
    }
}
