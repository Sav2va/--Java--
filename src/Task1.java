import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Введите первое число ");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число ");
            int b = new Scanner(System.in).nextInt();

            if (b > a) {
                System.out.println("\n" + b + " > " + a + "\n");
            } else if (b < a) {
                System.out.println("\n" + b + " < " + a + "\n");
            } else {
                System.out.println("\n" + b + " = " + a + "\n");
            }
            int addition = a + b;
            System.out.println("Сложение: " + a + " + " + b + " = " + addition);
            int subtraction = a - b;
            System.out.println("Вычетание: " + a + " - " + b + " = " + subtraction);
            int multiplication = a * b;
            System.out.println("Умножение: " + a + " * " + b + " = " + multiplication);
            if (a == 0 || b == 0) {
                System.out.println("На ноль делить нельзя");
            } else if (a >= b) {
                int divisionInt = a / b;
                System.out.println("Деление: " + a + " / " + b + " = " + divisionInt);
            } else {
                double divisionDouble = (double) a / b;
                System.out.println("Деление: " + a + " / " + b + " = " + divisionDouble);
            }
        }
    }
}


