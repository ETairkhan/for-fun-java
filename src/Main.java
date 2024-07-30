import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = {5,1,3,4,2};
        sumOfNumbersInArray(numbers);

    }
    public static void sumOfNumbersInArray(int[] integers){
        int index = 0;
        while( index < integers.length){
            int number = integers[index];
            for(int i =0; i < number; i++){
                System.out.print("*");
            }
            System.out.println();
            index++;
        }

    }

}
