import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше 0.");
            return;
        }

        int[] numbers = new int[n];

        //do while
        int i = 0;

        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < n);

        int sum = 0;
        i = 0;

        while (i < n) {
            sum += numbers[i];
            i++;
        }

        int max = numbers[0];
        int min = numbers[0];

        i = 1;

        while (i < n) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            i++;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}