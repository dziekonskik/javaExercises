public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[]{
                new Smartphone("124-123-324"),
                new MobilePhone("234560-233"),

        };

        for (Phone phone : phones) {
            phone.displayCallHistory();
        }

    }
}