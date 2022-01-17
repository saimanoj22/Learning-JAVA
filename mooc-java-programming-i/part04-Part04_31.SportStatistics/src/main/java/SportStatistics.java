
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Sports> record = new ArrayList<>();
        
        try(Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()){
                String row = fileScan.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                record.add(new Sports(homeTeam, visitTeam, homePoints, visitPoints));
            }
        } catch(Exception err){
            System.out.println("Error: " + err.getMessage());
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0, wins = 0, loss = 0;
        
        for(int i = 0; i < record.size(); i++){
            if(record.get(i).getHomeTeam().equals(team) || record.get(i).getVisitTeam().equals(team)){
                games++;
                if(record.get(i).getHomeTeam().equals(team)){
                    if(record.get(i).getHomePoints() > record.get(i).getVisitPoints()){
                        wins++;
                    }else{
                        loss++;
                    }
                }else{
                    if(record.get(i).getHomePoints() < record.get(i).getVisitPoints()){
                        wins++;
                    }else{
                        loss++;
                    }                    
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
    }

}
