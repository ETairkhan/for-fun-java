public class Counter {
    private int value;

    //overloaded constructor
    public Counter(int value){
        this.value = value;
    }
    public Counter(){
        this.value =0;
    }

    public int value(){
        return value;
    }

    public void increase(){
        increase(1);
    }
    public void decrease(){
       decrease(1);
    }

    public void increase(int increaseBy){
        value+=increaseBy;
    }
    public void decrease(int decreaseBy){
        value -= decreaseBy;
    }
    public String toString(){
        return value + " and ";
    }

}
