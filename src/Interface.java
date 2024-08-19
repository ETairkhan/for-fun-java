import java.util.Scanner;

public class Interface {
    private TodoList todoList;
    private Scanner scanner;

    public Interface(TodoList todoList, Scanner scanner ){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){

            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.equals("stop")){

                break;

            }else if(command.equals("add")){

                System.out.print("To add: ");
                String newThing = scanner.nextLine();
                todoList.add(newThing);

            }else if(command.equals("list")){

                todoList.print();

            }else if(command.equals("remove")){

                System.out.print("Which one is removed? ");
                int removePlace = Integer.parseInt(scanner.nextLine());
                todoList.remove(removePlace);

            } else{
                System.out.println("Unknown command!");
            }

        }
    }

}
