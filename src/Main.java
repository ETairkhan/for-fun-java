import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int passingGrades = 0;
        int passingGradesCount = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        while(true){
            int input = scanner.nextInt();
            if( input == -1){
                break;
            }else if(input > 0 && input <=100){
                sum+= input;
                count++;
                if(input < 50){
                    zero++;
                }else if(input < 60){
                    one++;
                }else if(input < 70){
                    two++;
                }else if(input <80){
                    three++;
                }else if(input <90){
                    four++;
                }else {
                    five++;
                }

                if(input >= 50){
                    passingGrades+=input;
                    passingGradesCount++;
                }
            }
        }
        System.out.println("Point average (all): " + (double) sum / count);
        if(passingGrades > 0){
            System.out.println("Point average (passing): "+ (double) passingGrades / passingGradesCount);
            System.out.println("Pass percentage: " + (double)  100 * passingGradesCount / count );
        }else{
            System.out.println("Point average (passing):-");
            System.out.println("Pass percentage: " + 0.0);
        }
        System.out.println("Grade distribution: ");
        System.out.println("5: " + getStars(five));
        System.out.println("4: " + getStars(four));
        System.out.println("3: " + getStars(three));
        System.out.println("2: " + getStars(two));
        System.out.println("1: " + getStars(one));
        System.out.println("0: " + getStars(zero));



    }
    public static String getStars(int number){
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.append("*");
            number--;
        }
        return sb.toString();
    }

}