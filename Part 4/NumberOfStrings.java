
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            i++;
        }
        
        if (i==0){
            System.out.println(0);
        }
        else {
            System.out.println(i);
        }

    }
}
