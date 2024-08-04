public class Main {

    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");

        ada.printPerson();
        antti.printPerson();
        System.out.println("");

        ada.growOlder();
        ada.growOlder();

        ada.printPerson();
        antti.printPerson();
    }
}