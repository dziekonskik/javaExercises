public class Square implements Comparable<Square> {
    int length, number;
    static int counter;

    public Square(int length) {
        this.length = length;
    }

    public int getArea() {
        return this.length * this.length;
    }

    @Override
    public String toString() {
        return "Number: " + number + " length: " + length;
    }

    public int compareTo(Square sq) {
        return this.getArea() - sq.getArea();
    }
}
