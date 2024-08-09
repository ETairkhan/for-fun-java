import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args){

        System.out.print("Name of the file?");
        Scanner smt = new Scanner(System.in);
        String name = smt.nextLine();
        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            ArrayList<Integer> listAge =new ArrayList<>();
            ArrayList<String> listName =new ArrayList<>();
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] parts = row.split(",");
                String user = parts[0];
                int age = Integer.parseInt(parts[1]);
                listAge.add(age);
                listName.add(user);
            }
            while(true){
                for (int i = 0; i< listName.size(); i++){
                    if(listAge.get(i) > 1){
                        System.out.println(listName.get(i) +", age: " + listAge.get(i) + " years" );
                    }else {
                        System.out.println(listName.get(i) +", age: " + listAge.get(i) + " year" );
                    }

                }
                break;
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + name +" failed");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Attempted to access file: " + Paths.get("data.txt").toAbsolutePath());

        }





    }
}