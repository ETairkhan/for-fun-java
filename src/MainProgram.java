import java.util.Scanner;

public class MainProgram{
    public static void main(String[] args){
        PaymentCard paulCard = new PaymentCard("Paul", 20);
        PaymentCard mattCard = new PaymentCard("Matt",30);
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println(paulCard);
        System.out.println(mattCard);
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println(paulCard);
        System.out.println(mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println(paulCard);
        System.out.println(mattCard);
    }
}