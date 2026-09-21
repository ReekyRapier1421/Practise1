public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");
        System.out.printf("%-4s %-8s %-10s%n", "n", "1/n", "сумма");
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            sum += term;
            System.out.printf("%-4d %-8.4f %-10.4f%n", n, term, sum);
        }
    }
}
