public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }


    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents +addition.cents);



        return newMoney;
    }

    public boolean lessThan(Money compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Money)){
            return false;
        }

        Money comparedMoney = (Money) compared;

        if(this.euros < compared.euros || this.cents < compared.cents){
            return true;
        }
        return false;
    }
    public Money minus(Money decrease){
        boolean lessEuros = this.euros < decrease.euros;
        boolean sameEuros = this.euros == decrease.euros;
        boolean lessCents = this.cents < decrease.cents;
        boolean sameCents = this.cents == decrease.cents;

        if (lessEuros || (sameEuros && lessCents)) {
            return new Money(0, 0);
        }
        if (lessCents){
            return new Money(this.euros - decrease.euros -1 , 100 - decrease.cents);
        }

        Money newMoney = new Money(this.euros - decrease.euros, this.cents - decrease.cents);



        return newMoney;
    }


    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
