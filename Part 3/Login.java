
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user1 = "alex";
        String user2 = "emma";
        String password1 = "sunshine";
        String password2 = "haskell";
        System.out.print("Enter username: ");
        String attempt = scanner.nextLine();
        System.out.print("Enter password: ");
        String passAttempt = scanner.nextLine();
        if (attempt.equals(user1) || attempt.equals(user2)){
            if (passAttempt.equals(password1) || passAttempt.equals(password2)){
                System.out.println("You have successfully logged in!");
            }
        } else{
            System.out.println("Incorrect username or password!");
        }

    }
}
