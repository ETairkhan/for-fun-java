import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        while (true){
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            if (number > 0){
                sum = sum+number;
                numbers++;
            }

        }
        if (sum >0){
            System.out.println((double) sum/numbers);
        }
        else{
            System.out.println("cannot calculate the average");
        }
    }
}