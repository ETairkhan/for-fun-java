import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = new Scanner(System.in);
        this.simpleDictionary= new SimpleDictionary();

    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")){
                System.out.print("Word: ");
                String  word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                simpleDictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String translateThis = scanner.nextLine();
                if (simpleDictionary.translate(translateThis) == null) {
                    System.out.println("Word " + translateThis +" was not found");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(translateThis));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
