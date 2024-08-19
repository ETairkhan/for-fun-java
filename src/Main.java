import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        Interface something = new Interface(todoList, scanner);
        something.start();
    }
}
