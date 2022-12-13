import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();

        if(word.isEmpty()){
            throw new RuntimeException("Пустое место не является словом! Введите слово!");
        }
    }   
}
