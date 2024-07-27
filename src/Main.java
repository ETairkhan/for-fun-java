import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        while(true){
            String name = scanner.nextLine();
            if (name.equals(" ")){
                break;
            }

            names.add(name);
            index++;
        }

        System.out.println(names.get(0));
        System.out.println(names.get(index));
    }
}
