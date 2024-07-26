import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            String names = x.nextLine();
            if (names.equals(" ")){
                break;
            }
            list.add(names);
        }

        System.out.println(list.get(2));
    }
}