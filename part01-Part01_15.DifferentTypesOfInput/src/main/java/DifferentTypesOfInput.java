
import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int intNumber = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doubleNumber = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + intNumber);
        System.out.println("You gave the double " + doubleNumber);
        System.out.println("You gave the boolean " + boolValue);
 
    }
}
