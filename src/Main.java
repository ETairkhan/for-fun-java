import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 7;
        numbers[5] = 7;
        numbers[6] = 7;

        System.out.print("Search for? ");
        int number = scanner.nextInt();
        int index = 0;
        while (index < numbers.length) {
            if(number == numbers[index]){
                System.out.println(number + " is at index "+ index + ".");
            }
            index++;
        }
    }
}
