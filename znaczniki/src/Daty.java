public class Daty {
    public static void main(String[] args) {
        /*Data może być scharakteryzowana trzema liczbami oznaczającymi rok, miesiąc i dzień 1
miesiąca. Jeśli nie będą nam potrzebne daty z odległej przeszłości, można rok poda-
wać względem roku 2000 (np. rok 2032 jako 32). Zakładając, że nie będziemy sięgali
w przyszłość poza rok 2127, rok będzie liczbą z przedziału [0,127], a do zapisania
takich liczb wystarczy nam 7 bitów. Do zapisania numeru miesiąca wystarczą 4 bity
(bo można na nich zapisać dowolną liczbę całkowitą z zakresu [0,15]) a na numer
dnia 5 bitów (co odpowiada zakresowi [0,31]). Tak więc pełną datę można zapisać na
16 bitach. Zmienne typu int są 32 bitowe, czyli można w takiej zmiennej zakodować
dwie daty, na przykład początku i końca pewnego okresu.
Napisz program definiujący dwie daty (from i to), każda w postaci trzech liczb (rok,
miesiąc, dzień). Upakuj je w jednym intcie. Następnie rozpakuj go z powrotem do
sześciu liczb.*/
        int fromy = 2024, fromm = 2, fromd = 3;
        int toy = 2127, tom = 11, tod = 29;
        int period = 0;
        int baseyear = 2000;

        System.out.println("**** Original\n" +
                "From " + fromy + "(" + Integer.toBinaryString(fromy) + ")" + "/" +
                fromm + "(" + Integer.toBinaryString(fromm) + ")" + "/" + fromd + "(" + Integer.toBinaryString(fromd) + ")" + " \nto " +
                toy + "(" + Integer.toBinaryString(toy) + ")" + "/" + tom + "(" + Integer.toBinaryString(tom) + ")" + "/" + tod + "(" + Integer.toBinaryString(tod) + ")");

        period = (fromy- baseyear);
        period = (period << 4) + fromm;
        period = (period << 5) + fromd;
        period = (period << 7) + (toy-baseyear);
        period = (period << 4) + tom;
        period = (period << 5) + tod;

        System.out.println(Integer.toBinaryString(period));
        fromy = fromm = fromd = toy = tom = tod = 0;

        fromy = (period >> 5+4+7+5+4 & 0b1111111) + baseyear;
        fromm = period >> 5+4+7+5 & 0b1111;
        fromd = period >> 5+4+7 & 0b11111;
        toy = (period >> 5+4 & 0b1111111) + baseyear;
        tom = period >> 5 & 0b1111;
        tod = period & 0b11111;

        System.out.println("**** Reconstructed\n" +
                "From " + fromy + "/" +
                fromm + "/" + fromd + " to " +
                toy + "/" + tom + "/" + tod);
    }
}
