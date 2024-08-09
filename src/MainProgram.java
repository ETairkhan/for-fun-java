import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args){

        System.out.println("Name of the file");
        Scanner smt = new Scanner(System.in);
        String name = smt.nextLine();
        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            ArrayList<String> list =new ArrayList<>();
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                list.add(row);
            }
            while(true){
                System.out.println("Searcher for:");
                String guest = smt.nextLine();
                if(guest.isEmpty()){
                    break;
                }else if(list.contains(guest)){
                    System.out.println("Found!");
                }else {
                    System.out.println("Not found.");
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + name +" failed");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Attempted to access file: " + Paths.get("data.txt").toAbsolutePath());

        }
        System.out.println("Thank you!");




    }
}