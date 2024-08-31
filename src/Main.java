import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter point totals, -1 stops: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            int input = scanner.nextInt();
            if( input == -1){
                break;
            }else if(input > 0){
                sum+= input;
                count++;
            }
        }
        System.out.println("Point average (all): " sum / count);

    }//kfajsd;kfjjksdjfkl;ajsfkl;sdjfkl;j
}