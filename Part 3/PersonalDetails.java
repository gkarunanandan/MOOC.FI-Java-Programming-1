
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] pieces = input.split(",");
        int oldest = Integer.valueOf(pieces[1]);
        int longest = pieces[0].length();
        String name = pieces[0];
        double sum = Integer.valueOf(pieces[1]);
        double average;
        int count=1;
        while (true){
            input = scanner.nextLine();
            pieces = input.split(",");
            if (input.equals("")){
                break;
            }
            if (longest < pieces[0].length()){
                longest = pieces[0].length();
                name = pieces[0];
            }
            count+=1;
            sum+=Integer.valueOf(pieces[1]);
        }
        average = (double) sum/count;
        System.out.println("Longest name: "+ name);
        System.out.println("Average of the birth years: "+average);

    }
}
