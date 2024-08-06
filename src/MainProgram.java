import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if ( name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = scanner.nextInt();

            System.out.print("Publication year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            books.add(new book(name,pages,year));

        }
        System.out.println("What information will be printed? ");
        String what = scanner.nextLine();
        if ( what.equals("everything")){
            for(book i: books){
                System.out.println(i);
            }
        }else if (what.equals("name")){
            for(book i : books){
                System.out.println(i.getNames());
            }
        }


    }
}