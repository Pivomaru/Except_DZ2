import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите дробное число: ");
        String input = scanner.next();
        String floatNumberPattern = "-?\\d+(\\.\\d+)?";

        while (!input.matches(floatNumberPattern)) {
            input = scanner.next();
        }
        System.out.println("Введенное число: " + input);
    }
}
