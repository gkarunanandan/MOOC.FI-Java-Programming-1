
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        
        System.out.println("Give two indices to swap:");
        int firstindex = Integer.valueOf(scanner.nextLine());
        int secondindex = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        index = 0;
        int swap1 = array[secondindex];
        int swap2 = array[firstindex];
        while (index < array.length) {
            if (index == firstindex){
                System.out.println(swap1);
                index++;
            }
            if (index == secondindex){
                System.out.println(swap2);
                index++;
            } else{
            System.out.println(array[index]);
            index++;}
        }
    }

}
