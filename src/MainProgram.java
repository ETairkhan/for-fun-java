import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args){

        System.out.print("File?");
        Scanner smt = new Scanner(System.in);
        String name = smt.nextLine();
        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            ArrayList<Integer> list =new ArrayList<>();
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                int numbers = Integer.parseInt(row);
                list.add(numbers);

            }
            while(true){
                System.out.print("Lower bound?");
                int lower = smt.nextInt();
                System.out.print("Upper bound?");
                int upper = smt.nextInt();
                int count =0;
                for(int i = 0; i < list.size(); i++){
                    if(list.get(i) >= lower && list.get(i) <= upper){
                        count++;
                    }
                }
                System.out.println("Numbers: " + count );
              break;
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + name +" failed");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Attempted to access file: " + Paths.get("data.txt").toAbsolutePath());

        }





    }
}