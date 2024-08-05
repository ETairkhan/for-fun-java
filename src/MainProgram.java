import java.util.Scanner;

public class MainProgram{
    public static void main(String[] args){
        Statistics statistics = new Statistics();
        Scanner scanner =new Scanner(System.in);

        while (true){
            int numbers = scanner.nextInt();
            if (numbers == -1){
                break;
            }
            statistics.addNumber(numbers);


        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evenSum());
        System.out.println("Sum of odd numbers: " + statistics.oddSum());
        System.out.println("Average: " + statistics.average());
    }
}