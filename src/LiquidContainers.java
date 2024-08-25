import java.util.Scanner;


public class LiquidContainers {
    private int first;
    private int second;
    private Scanner scanner;

    public LiquidContainers(){
        this.first =0;
        this.second = 0;
        this.scanner = new Scanner(System.in);
    }

    public void main(){
        while(true){
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];


            if(command.equals("quit")){

                break;

            }else if(command.equals("add")){

                int amount = Integer.parseInt(parts[1]);

                if(amount>= 100){
                    this.first = 100;
                }else if (amount >= 0){
                    this.first+=amount;
                }


            }else if(command.equals("move")){

                int amount = Integer.parseInt(parts[1]);

                if( amount >= 0 && this.first >= amount) {
                    this.first -= amount;
                    this.second += amount;
                }
                if(this.second >=100){
                    this.second = 100;
                }

            }else if(command.equals("remove")){

                int amount = Integer.parseInt(parts[1]);
                if(amount >= this.second){
                    this.second = 0;
                }else if(amount > 0){
                    this.second -=amount;
                }
            }

        }



    }


}
