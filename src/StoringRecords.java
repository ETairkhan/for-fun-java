import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File: ");
        String file = scanner.nextLine();
        System.out.println("Team: ");
        String team = scanner.nextLine();
        int wins = 0;
        int games =0 ;
        int losses =0;

            try(Scanner getFile = new Scanner(Paths.get(file))){
                while(getFile.hasNextLine()){
                    String line = getFile.nextLine();
                    String[] teams = line.split(",");
                    String home = teams[0];
                    String away = teams[1];
                    String Score1 = teams[2];
                    String Score2 = teams[3];
                    int homeScore = Integer.parseInt(Score1);
                    int awayScore = Integer.parseInt(Score2);
                    if(home.equals(team)){
                        games++;
                        if(homeScore > awayScore){
                            wins++;
                        }else {
                            losses++;
                        }
                    }

                    if(away.equals(team)){
                        games++;
                        if(homeScore < awayScore){
                            wins++;
                        }else {
                            losses++;
                        }
                    }
                }

            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        System.out.println("Games " + games);
        System.out.println("WINS " + wins);
        System.out.println("LOSSES " + losses);



    }
}