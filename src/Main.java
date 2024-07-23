import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int result = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd =0;
        while (true){
            int number = scanner.nextInt();
            if(number == -1 ){
                System.out.println("Thx! Bye!");
                break;

            }
            if (number % 2 ==0 ){
                even ++;
            }
            if (number % 2 !=0 ){
                odd ++;
            }
            count++;
            result +=number;
            average = (double) result/count;
        }
        System.out.println("Sum:" + result);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even:" + even);
        System.out.println("Odd: " + odd);
    }
}