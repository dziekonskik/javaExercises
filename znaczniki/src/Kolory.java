public class Kolory {
    public static void main(String[] args) {
        /*
        *Napisz program definiujący cztery liczby naturalne z zakresu [0,255] reprezentujące
składowe koloru: α, red, green, blue. Następnie zapakuj te cztery liczby do jednego
inta, któregokolejnebajty(odnajbardziejznaczącego)odpowiadająwartościomskła-
dowych w podanej wyżej kolejności.
Korzystając tylko ze znalezionego inta, rozpakuj go do czterech liczb odpowiadają-
cych skladowym tego koloru. */

        int r = 121, g = 255, b = 130, a = 23, color = 0;

        color = a;
        color = (color << 8) + r;
        color = (color << 8) + g;
        color = (color << 8) + b;

        System.out.println("r, g, b, a = " +
                ", " + r + "(" + Integer.toBinaryString(r) + ")" +
                ", " + g + "(" + Integer.toBinaryString(g) + ")" +
                ", " + b + "(" + Integer.toBinaryString(b) + ")" +
                ", " + a + "(" + Integer.toBinaryString(a) + ")");
        System.out.println("color = " + color + " color_bin: " + Integer.toBinaryString(color));

        a = r = g = b = 0;

        a = (color >> 24) & 0xff;
        b = (color >> 16) & 0xff;
        g = (color >> 8) & 0xff;
        r = (color >> 0) & 0xff;

        System.out.println("r, g, b, a = " +
                ", " + r + "(" + Integer.toBinaryString(r) + ")" +
                ", " + g + "(" + Integer.toBinaryString(g) + ")" +
                ", " + b + "(" + Integer.toBinaryString(b) + ")" +
                ", " + a + "(" + Integer.toBinaryString(a) + ")");
    }
}
