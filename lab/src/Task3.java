public class Task3 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9, 14, 6, 1};
        int sum = 0;

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();

        double avg = (double) sum / arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", avg);
    }
}
