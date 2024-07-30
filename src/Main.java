import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest =0;
        String oldestName = null;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int oldest = Integer.parseInt(parts[1]);
            oldestName= parts[0];
            if(smallest < oldest){
                smallest = oldest;
                oldestName= parts[0];
            }

        }
        System.out.println("Age of the oldest: " + oldestName);


    }


}
