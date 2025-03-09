public class Calculator {
    public int calculateSquare(int number) {
        class Square {
            int getSquare() {
                return number * number;
            }
        }

        return new Square().getSquare();
    }
}
