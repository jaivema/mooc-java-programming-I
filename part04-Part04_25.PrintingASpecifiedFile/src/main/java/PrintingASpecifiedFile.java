 
import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingASpecifiedFile {
 
    public static void main(String[] args) {
        
        System.out.println("Which file should have its contents printed?");
        
        Scanner input = new Scanner(System.in);
        String file = input.nextLine();
        
        try (Scanner lines = new Scanner(Paths.get(file))) {
            while (lines.hasNextLine()) {
                String printLine = lines.nextLine();
                System.out.println(printLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
 
    }
}
 
