import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int s = 1;
        System.out.print("Give a number ");
        for (int i = scanner.nextInt(); s <=i; s++){
            result *=  s;
        }
        System.out.println("Factorial " + result);
    }
}