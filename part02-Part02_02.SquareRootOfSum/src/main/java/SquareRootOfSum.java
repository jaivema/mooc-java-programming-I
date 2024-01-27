
import java.util.Scanner;
 
public class SquareRootOfSum {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int numA = Integer.valueOf(scanner.nextLine());
        int numB = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt(numA+numB);
        System.out.println(squareRoot);
 
    }
}
