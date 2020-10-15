
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        String last = searchedFor;
        
        try(Scanner fileRead = new Scanner(Paths.get(file))){
            while(fileRead.hasNextLine()){
                String row = fileRead.nextLine();
                last = row;
                if (row.equals(searchedFor)){
                    System.out.println("Found!");
                    break;
                }                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            
        }
        
        if(last.equals(searchedFor)){
            System.out.println("Found!");
        }
        else {
            System.out.println("Not found.");
        }

    }
}
