
import java.util.Scanner;
 
public class NameOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int oldest = 0;
        int age = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            String[] parts = input.split(",");
            age = Integer.valueOf(parts[1]);
               
            if (oldest < age ){
                oldest = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
 
