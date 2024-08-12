public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money =1000;
    }

    public double eatAffordably(double payment) {
        if( payment >= 2.50){
            money += 2.50;
            payment -= 2.50;
            affordableMeals++;
            return payment;
        }else{
            return money;
        }

    }

    public double eatHeartily(double payment) {
        if( payment >= 4.30){
            money += 4.30;
            payment -=4.30;
            heartyMeals++;
            return payment;
        }else{
            return money;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance()>2.50){
            card.takeMoney(2.50);
           eatAffordably(2.50);
            return true;
        }else{
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance()>4.30){
            card.takeMoney(4.30);
            eatHeartily(4.30);
            return true;
        }else{
            return false;
        }
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
       card.addMoney(sum);
       money +=sum;

    }
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
