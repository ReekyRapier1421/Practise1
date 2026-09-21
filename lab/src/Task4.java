import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // ввод массива циклом do-while
        int i = 0;
        do {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < n);

        // сумма, максимум и минимум циклом while
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        i = 0;
        while (i < n) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            i++;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
