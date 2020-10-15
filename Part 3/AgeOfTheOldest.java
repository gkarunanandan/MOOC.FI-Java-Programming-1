
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pieces = input.split(",");
        int oldest = Integer.valueOf(pieces[1]);
        while (true) {
            input = scanner.nextLine();
            pieces = input.split(",");
            if (input.equals("")) {
                break;
            }
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
