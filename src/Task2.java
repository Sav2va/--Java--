import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String a = new Scanner(System.in).next();
        String b = new Scanner(System.in).next();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
