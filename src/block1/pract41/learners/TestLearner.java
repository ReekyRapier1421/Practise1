package block1.pract41.learners;

public class TestLearner {
    public static void main(String[] args) {
        Learner[] learners=new Learner[6];
        learners[0] = new Pupil("Сергей Бадров", 15, 9);
        learners[1] = new Student("Гарибян Эдмон", 19, "МИРЭА", 2);
        learners[2] = new Pupil("Пример Три", 12, 6);
        learners[3] = new Student("Леха", 20, "МИРЭА", 3);
        learners[4] = new Pupil("Биг-рашен Босс", 17, 11);
        learners[5] = new Student("Какойто Армянин", 21, "Хихигс", 4);

        System.out.println("Все учащиеся:");
        for (int i=0; i<learners.length; i++) {
            System.out.println(learners[i]);
        }

        System.out.println("Школьники:");
        for (int i=0; i<learners.length; i++) {
            if (learners[i] instanceof Pupil) {
                System.out.println(learners[i]);
            }
        }

        System.out.println("Студенты:");
        for (int i=0; i<learners.length; i++) {
            if (learners[i] instanceof Student) {
                System.out.println(learners[i]);
            }
        }
    }
}
