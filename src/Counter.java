public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int initialValue){
        this.value = initialValue;
    }
    public void increase(){
        this.value = this.value + 1;
    }
    public String toString(){
        return "Value: " + value;
    }
    public Counter clone(){
        Counter clone = new Counter(this.value);
        return clone;
    }
}
