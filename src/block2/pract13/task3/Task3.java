package block2.pract13.task3;

public class Task3 {
    public static void main(String[] args) {

        String[] lines={
                "Россия, Московская область, Москва, Вернадского, 78, 1, 215",
                "Армения, Котайк, Ереван, Абовяна, 12, 2, 7",
                "Россия, Татарстан, Казань, Баумана, 44, 3, 101",
                "Россия, Приморский край, Владивосток, Светланская, 5, 1, 18"
        };

        System.out.println("\nРазбор методом split, разделитель запятая");
        for (int i=0; i<lines.length; i++) {
            Address a=new Address();
            a.Split(lines[i]);
            System.out.println("  "+a);
        }

        String[] mixed={
                "Россия; Московская область. Москва, Вернадского; 78. 1, 215",
                "Армения. Котайк; Ереван. Абовяна, 12; 2. 7"
        };


        System.out.println("\nРазбор классом StringTokenizer, разделители , . ;");
        for (int i=0; i<mixed.length; i++) {
            Address a=new Address();
            a.Tokenizer(mixed[i]);
            System.out.println("  "+a);
        }
    }
}
