import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        while(true){
            int number = scanner.nextInt();
            index++;
            numbers.add(number);
            if( number == 9999 ){
                break;
            }
        }
        System.out.println("Search for?");

       int smallest = numbers.get(0);
       for(int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if ( smallest > number){
                smallest = number;
            }
       }

        int find = smallest;

        for (int i = 0; i < index; i++ ){
            int number = numbers.get(i);
            if ( number == find){
                System.out.println(find + " is at index " + i);
            }

        }

    }
}
