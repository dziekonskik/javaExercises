public class Car {
    private String brand;
    Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    class Engine {
        void start() {
            System.out.println("Silnik samochodu " + brand + " został uruchomiony!");
        }
    }
}
