public class PaymentCard {
    private double balance;
    private String name;

    public PaymentCard(String name , double openingBalance) {
        this.balance = openingBalance;
        this.name = name;
    }

    public String toString() {
        return name+ ":"+  " The card has a balance of " +  Double.toString(balance)  + " euros";
    }
    public void eatAffordably() {
        if ( balance >=2.60 ){
            balance -=2.60;
        }

    }

    public void eatHeartily() {
        if ( balance >= 4.60) {
            balance -= 4.60;
        }

    }
    public void addMoney(double amount) {
        if ( amount > 0) {
            balance += amount;
            if (balance >= 150) {
                balance = 150;
            }
        }
    }
}