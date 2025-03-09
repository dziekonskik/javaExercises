public class Main {
    public static void main(String[] args) {
        Car car = new Car("audi");
        car.engine.start();
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculateSquare(2));

    }
}