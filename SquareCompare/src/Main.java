import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(250);
        Square sq2 = new Square(34);
        Square sq3 = new Square(14);
        Square sq4 = new Square(47);
        Square sq5 = new Square(121);

        Square[] squares = new Square[]{
                sq1, sq2, sq3, sq4, sq5
        };

        for (Square s1 : squares) {
            System.out.println(s1.toString());
        }

        Arrays.sort(squares);
    }
}