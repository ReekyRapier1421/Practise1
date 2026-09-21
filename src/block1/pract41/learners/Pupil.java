package block1.pract41.learners;

public class Pupil extends Learner {
    private int grade;

    public Pupil(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + grade + " класс";
    }
}
