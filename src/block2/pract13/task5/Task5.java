package block2.pract13.task5;

public class Task5 {
    public static void main(String[] args) {

        String[] raw={
                "+79175655655",
                "+104289652211",
                "89175655655",
        };

        for (int i=0; i<raw.length; i++) {
            PhoneNumber phone=new PhoneNumber(raw[i]);
            System.out.println(raw[i]+"  "+phone);
        }
    }
}
