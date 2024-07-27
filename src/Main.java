import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
            // alternatively: System.out.println(numbers.get(i));
        }
    }
}
