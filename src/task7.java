import java.util.Scanner;

public class task7 {

    public static long factorial(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не существует.");
        } else {
            long result = factorial(n);

            System.out.println(n + "! = " + result);
        }
    }
}