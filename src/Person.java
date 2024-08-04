public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // no one exceeds the age of 30
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
}