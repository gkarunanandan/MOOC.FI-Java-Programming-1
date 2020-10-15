
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,12);

    }
    public static void divisibleByThreeInRange (int beginning, int end){
        int i = beginning;
        while (i < end +1){
            if (i%3 < 1){
                System.out.println(i);
            }
            i++;
        }
    }

}
