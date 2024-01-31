 
import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counts = 0;
        double avg = 0;
        
        while (true){
            
            System.out.println("Give a number:");
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){
                break;
            }else if (num > 0){
                sum = sum + num;
                counts =  counts +1;
            }
        }
        if (sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            avg = (double)sum/counts;
            System.out.println("Average of the numbers: " + avg);
        }
    }
}
 
