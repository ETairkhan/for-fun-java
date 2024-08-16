import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(Scanner scanner, WordSet wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }
            wordSet.add(word);
        }
        for(String word: wordSet.getList()){
            System.out.println(word);
        }
        System.out.println("You gave the same word twice!");
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
    }


}
