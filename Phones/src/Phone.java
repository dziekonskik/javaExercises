public class Phone {
    String communicationInterface;
    String color;
    String number;

    Phone(String number) {
        this.number = number;
    }

    void call(String number) {
        System.out.println("Dzwonisz pod nr: " + number);
    }

    void displayCallHistory() {
        System.out.println("No history");
    }
}
