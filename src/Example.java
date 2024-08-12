

public class Example {
    //Identical twins I finished her to learn java( and wanna learn javascript instead)
    //never used springboot actualy !!!
    public static void main(String[] args) {
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        }
    }
}

