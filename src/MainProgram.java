import java.util.Scanner;
import java.util.ArrayList;
public class MainProgram{
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Person john = new Person("John");

        while(true){
            System.out.println("Enter a name,empty will stop: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }

            persons.add(new Person(name));

        }
        System.out.println();
        System.out.println("Perons in total: " + persons.size());
        System.out.println("Persons: ");
        for (Person i: persons){
            System.out.println(i);
        }

    }
}