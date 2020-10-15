
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pieces = input.split(",");
        int oldest = Integer.valueOf(pieces[1]);
        String old = pieces[0];
        while (true){
            input = scanner.nextLine();
            pieces = input.split(",");
            if (input.equals("")){
                break;
            }
            if (oldest < Integer.valueOf(pieces[1])){
                oldest = Integer.valueOf(pieces[1]);
                old = pieces [0];
            }
        }
        System.out.println("Name of the oldest" + old);

    }
}
