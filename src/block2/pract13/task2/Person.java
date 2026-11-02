package block2.pract13.task2;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }

    public String getShortName() {
        StringBuilder sb=new StringBuilder();
        if (surname!=null && !surname.isEmpty()) {
            sb.append(surname);
        }
        boolean hasName=name!=null && !name.isEmpty();
        boolean hasPatronymic=patronymic!=null && !patronymic.isEmpty();
        if (hasName || hasPatronymic) {
            sb.append(" ");
        }
        if (hasName) {
            sb.append(name.charAt(0)).append(".");
        }
        if (hasPatronymic) {
            sb.append(patronymic.charAt(0)).append(".");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getShortName();
    }
}
