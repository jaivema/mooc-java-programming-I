
import java.nio.file.Paths;
import java.util.Scanner;
 
public class RecordsFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner lines = new Scanner(Paths.get(file))){
            while(lines.hasNext()){
                String line = lines.nextLine();
            
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
 
                String printLine = name +", age: "+ age;
                if (age==1){
                    printLine = printLine +" year";
                }else{
                    printLine = printLine +" years";
                }
                System.out.println(printLine);
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
