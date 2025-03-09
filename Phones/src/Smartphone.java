public class Smartphone extends MobilePhone {
    Person[] contacts = new Person[]{
            new Person("Jane", "Ass", "123-123-2424"),
            new Person("Triss", "Puss", "113-133-1424"),
    };

    Smartphone(String number) {
        super(number);
    }

    void displayCallHistory() {
        for (Person contact : contacts) {
            if (contact.number.equals(this.communicationInterface)) {
                System.out.println(contact.firstName + ": " + contact.number);
            } else {
                System.out.println("332-2445");
            }
        }
    }
}
