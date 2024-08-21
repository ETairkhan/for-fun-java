import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int score = Integer.valueOf(input);

            if (score < 0 || score > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            register.addGradeBasedOnPoints(score);
        }

        System.out.println("");
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");

            grade = grade - 1;
        }
        //Separating the program logic is a major benefit for the maintenance of the program. Since the program logic — in this case the GradeRegister — is its own class, it can also be tested separately from the other parts of the program. If you wanted to, you could copy the class GradeRegister and use it in your other programs. Below is an example of simple manual testing — this experiment only concerns itself with a small part of the register's functionality.
    }
}
