
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner lines = new Scanner(Paths.get(file))) {
            int games = 0;
            int wins = 0;
            int losses = 0;
            while (lines.hasNextLine()) {
                String line = lines.nextLine();
                
                String[] parts = line.split(",");
                String local = parts[0];
                String visitor = parts[1];
                int localPoints = Integer.valueOf(parts[2]);
                int visitorPoints = Integer.valueOf(parts[3]);
                
                if (local.equals(team) || visitor.equals(team)){
                    games ++;
                    if (local.equals(team) && (localPoints > visitorPoints)){
                        wins ++;
                    }else if (local.equals(team) && (localPoints < visitorPoints)){
                        losses ++;
                    }
                    if (visitor.equals(team) && (localPoints < visitorPoints)){
                        wins ++;
                    }else if (visitor.equals(team) && (localPoints > visitorPoints)){
                        losses ++;
                    }
                }
            }
            System.out.print("Games: "+ games +"\n");
            System.out.print("Wins: "+ wins +"\n");
            System.out.print("Losses: "+ losses +"\n");
            
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        
    }
}
