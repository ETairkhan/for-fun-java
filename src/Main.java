import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String smallest = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1]);
            sum = sum+ age;
            count++;
            String longest = parts[0];
            if(longest.length() > smallest.length()){
              smallest = longest;
            }

        }
        System.out.println("Longest name: " + smallest);
        System.out.println("Average of the birth years: " + (1.0* sum/count));


    }


}
