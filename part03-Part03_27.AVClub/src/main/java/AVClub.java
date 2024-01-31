
import java.util.Scanner;
 
public class AVClub {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String text = scanner.nextLine();
            
            if (!(text.equals(""))){
                String[] textSplit = text.split(" ");
                
                for (String avContent : textSplit) {
                    if (avContent.contains("av")) {
                        System.out.println(avContent);
                    }
                }
            }else{
                break;
            }
        }
    }
}

