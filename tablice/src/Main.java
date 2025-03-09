import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Niech arr będzie referencją do dowolnej, utworzonej w programie tablicy intów.
Utwórz i wydrukuj nową tablicę (brr), która zawiera elementy z pierwszej, ale tylko
parzyste i w odwrotnej kolejności niż w arr.
Naprzykład, jeśliarr maelementy[1, 4, 2, 5, 8, 6], totablicabrr powinnabyć[6, 8, 2, 4].
Po zmianie rozmiaru i/lub wartości elementów tablicy arr program powinien działać
prawidłowo bez żadnych innych modyfikacji.
[Uwaga: w Javie dopuszczalne jest tworzenie tablic o zerowym rozmiarze.]*/

        int[] arr = {1, 4, 2, 5, 8, 6};
        int counter = 0;

        for (int i =0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        int[] brr = new int[counter];

        for (int i = arr.length-1, index=0; i > 0; i--) {
            if (arr[i] % 2 == 0) {
               brr[index] = arr[i];
               index++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}