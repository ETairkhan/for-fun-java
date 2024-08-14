import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        ArrayList<Archive> archives = new ArrayList<>();
        Scanner scanner = new  Scanner(System.in);
        while(true){
            System.out.println("Identifier? (empty will stop):");
            String Identifier = scanner.nextLine();
            if(Identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }

            Archive item = new Archive(Identifier, name);

            if(!(archives.contains(item))){
                archives.add(item);
            }


        }

        System.out.println("==Items==");
        for(Archive item: archives){
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }




    }
}