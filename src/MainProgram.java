import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> tv = new ArrayList<>();
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if ( name.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            tv.add(new TelevisionProgram(name,duration));

        }
        System.out.print("Program's maximum duration?");
        int max = scanner.nextInt();
        for (TelevisionProgram person: tv) {
            if (max >=  person.getDuration()) {
                System.out.println(person);
            }
        }
    }
}