import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        UserInterface ui = new UserInterface(container1, container2, scanner);

        ui.start();


    }
}
