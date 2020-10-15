
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed");
        String input = scanner.nextLine();
        
        try (Scanner file = new Scanner(Paths.get(input))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


        //if (input.equals("song.txt")) {
        //    try (Scanner file = new Scanner(Paths.get(input))) {
        //        while (file.hasNextLine()) {
        //            String row = file.nextLine();
        //            System.out.println(row);
        //        }
        //    } catch (Exception e) {
        //        System.out.println("Error: " + e.getMessage());
        //    }

        //}

        //if (input.equals("data.txt")) {
        //    try (Scanner file2 = new Scanner(Paths.get(input))) {
        //        while (file2.hasNextLine()) {
        //            String row2 = file2.nextLine();
        //            System.out.println(row2);
        //        }
        //    } catch (Exception e) {
        //        System.out.println("Error: " + e.getMessage());
        //    }

        //}

    }
}
