public class Main {

    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("kvaak");
        Whistle roosterWhistle = new Whistle("Peef");
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}