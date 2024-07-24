import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printTriangle(int size) {
       int s= 1;
       while(size>=s){
           int i =1;
           while(s>=i){
               System.out.print("*");
               i++;
           }
           s++;
           System.out.println("");
       }
    }
}