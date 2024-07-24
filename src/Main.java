import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double answer = average(4,3,5,6);
        System.out.println("Greatest: " + answer);
    }

    public static double  sum(int number1, int number2,int number3,int number4 ) {
       return number1+number2+number3+number4;
    }
    public static double  average(int number1, int number2,int number3,int number4) {
        double sum = sum(number1,number2,number3,number4);
        return  sum /4;
    }
}