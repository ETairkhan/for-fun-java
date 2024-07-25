import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        printTriangle(10);
    }
    public static void printTriangle(int height) {
        int i, space, stars;
        // outer loop to handle rows
        for (i = 1; i <=height ; i++) {

            // inner loop to print spaces.
            for (space = 1; space <= height-i; space++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (stars = 1; stars <= i*2 - 1; stars++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
        for( i = 1;i <= height-1;i++)
        {
            System.out.print(" ");
            for(int j = height-3;j > 0;j--)
            {
                System.out.print(" ");
            }
            for(int k = 2;k > 0;k--)
            {
                System.out.print("| ");
            }
            System.out.println();
        }// end of lower part
    }
}