import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterface user = new UserInterface(register ,scanner);
        user.start();

        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());


    }
}
