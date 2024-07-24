import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        printRectangle(17,3);
    }
    public static void printRectangle(int width, int height) {
        int i = 1;
        while(height >=i){
            int s =1;
            while(width >= s){
                System.out.print("*");
                s++;
            }
            System.out.println("");
            i++;
        }
    }
}