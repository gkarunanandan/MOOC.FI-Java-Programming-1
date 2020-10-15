
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.next());
        int factorial = 1;
        for (int i = 1; i < number + 1; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
