import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        while(true){
            String names= x.nextLine();
            if(names.equals(" ")){
                break;
            }
            wordList.add(names);
        }
        System.out.println("In total: " + wordList.size());
    }
}
