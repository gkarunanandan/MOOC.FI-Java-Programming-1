
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int first = Integer.valueOf(scanner.next());
        System.out.println("Where from? ");
        int second = Integer.valueOf(scanner.next());
        for (int i = second; i < first + 1; i++){
            System.out.println(i);
        }
    }
}
