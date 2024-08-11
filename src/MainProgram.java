public class MainProgram {

    public static void main(String[] args) {
        Counter first = new Counter(1);
        Counter second = new Counter();

        first.increase(3);
        first.increase();
        second.decrease();
        second.decrease(3);
        System.out.println(first + ", " +second);
        //adsaf
    }
}