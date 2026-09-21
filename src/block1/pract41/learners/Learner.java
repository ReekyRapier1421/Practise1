package block1.pract41.learners;

public class Learner {
    protected String name;
    protected int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge(){return age;}

    @Override
    public String toString() {return name + ", " + age + " лет";}
}
