import java.util.Arrays;

public class PosNeg {
    public static void main(String[] args) {
        /*Niech arr będzie referencją do dowolnej, utworzonej w programie tablicy intów.
Utwórz i wydrukuj dwie nowe tablice (pos i neg), które zawierać będą elementy
z pierwszej, ale jedna tylko dodatnie, a druga tylko ujemne.
Na przykład, jeśli arr ma elementy [1,−4, 0, 5, 8,−6], to pos powinna być [1, 5, 8] a neg
[−4,−6].
Po zmianie rozmiaru i/lub wartości elementów tablicy arr program powinien działać
prawidłowo bez żadnych innych modyfikacji.
[Uwaga: w Javie dopuszczalne jest tworzenie tablic o zerowym rozmiarze.]*/


        int[] arr = { 1, -4, 0, 5, 8, -6 };
        int posLength = 0;
        int negLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negLength++;
            } else if (arr[i] > 0) {
                posLength++;
            }
        }
        int[] pos = new int[posLength];
        int[] neg = new int[negLength];

        for (int i = 0, posIndex = 0, negIndex = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[posIndex] = arr[i];
                posIndex++;
            } else if (arr[i] < 0) {
                neg[negIndex] = arr[i];
                negIndex++;
            }
        }

        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(neg));
    }
}
