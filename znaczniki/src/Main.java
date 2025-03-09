public class Main {
    public static void main(String[] args) {

/*Jak utworzyć liczbę typu int tak, żeby w jej reprezenatcji bitowej była jedynka na pozycji k
(pozycje liczymy od zera dla najmniej znaczącego bitu) a na pozostałych pozycjach zera.
Utwórz taką liczbę dla kilku wartości k i ją wydrukuj.
* */

        int bitPos = 3;
        int mask = 1 << bitPos;
        int testInt = 17;
        int intWithBitOnPos = testInt | mask; // jesli zorujemy z maska to bedzie niezmienione plus jedynka na pozycji z maski, jesli zandujemy to wyzeruje wszystko oprócz pozycji gdzie i tu i tu byłą 1

        System.out.println("testInt: " + testInt + " - binary: " + Integer.toBinaryString(testInt) + " intWithBitOnPos: " + intWithBitOnPos + " - binary: " + Integer.toBinaryString((intWithBitOnPos)));

        /*Zdefiniuj dowolną liczbę typu int i za pomocą ANDowania dla kilku wartości k sprawdź, czy bit na pozycji k jest w tej liczbie 0 czy 1.*/

        int testInt1 = 42;
        int bitPosToCheck = 3;
        int checkIf1 = testInt1 & (1 << bitPosToCheck);

        System.out.println("testInt1 = " + testInt1 + ": " + Integer.toBinaryString(testInt1) + " is 1 or 0: " + Integer.toBinaryString(checkIf1
        ));

        /*
         * Mając liczbę n zdefiniuj liczbę k której reprezentacja bitowa zawiera same zera,
         * ale najmniej znaczący bajt jest taki sam jak najmniej znaczący bajt n.
         * Na przykład, jeśli n jest −1, to k powinno mieć wartość 255 (dlaczego?).*/

        int testint2 = -1;
        int byteMask = 0xff;
        int testK = testint2 & byteMask;

        System.out.println("testK: " + testK + " - binary: " + Integer.toBinaryString(testK));


        /*
        Mając liczbę n zdefiniuj liczbę k której reprezentacja bitowa zawiera same zera,
         ale jej najmniej znaczący bajt jest taki sam jak drugi najmniej znaczący bajt n.
         Na przykład, jeśli n jest 1793, to k powinno mieć wartość 7 (dlaczego?).
        */
        int numberTotest = 1793;
        int withLeastImportantByte = numberTotest & 0xff;
        int withSecondLeastImportantByte = (numberTotest & (0xff << 8)) >> 8;

        System.out.println(numberTotest + "-" + Integer.toBinaryString(numberTotest)
                + " najmniej istotny bajt - "
                + withLeastImportantByte + " - bitowo: "
                + Integer.toBinaryString(withLeastImportantByte)
                + " ,drugi najmniej istotny bajt - "
                + withSecondLeastImportantByte + " - bitowo: - "
                + Integer.toBinaryString(withSecondLeastImportantByte));

/*Mając liczbę n zdefiniuj liczbę k, która ma taką samą reprezentację bitową jak n, ale z odwróconym bitem na pozycji 5
(pozycje liczymy od zera dla najmniej znaczącego bitu). Na przykład jeśli n jest 65, to
powinno wypisać A a, a jeśli n jest 70, powinniśmy zobaczyć F f (dlaczego?). Wska- zówka: użyj XORowania.*/

        int toreverse5Bit = 65;
        int reverseBitMask = 1 << 5;
        int withReversedBit = toreverse5Bit ^ reverseBitMask;


        System.out.println("toreverse5Bit " + (char) toreverse5Bit + " bitowo: " + Integer.toBinaryString(toreverse5Bit) + " maska: " + Integer.toBinaryString(reverseBitMask) + " result: " + (char)withReversedBit+ " bitowo: " + Integer.toBinaryString(withReversedBit));

        /*
        * Mając dwie dodatnie liczby n i m, obie mniejsze od 256, zdefiniuj liczbę k której drugi najmniej znaczący bajt jest taki sam jak najmniej znaczący bajt n,
         a bajt najmniej znaczący taki sam jak najmniej znaczący bajt m. Na przykład, jeśli n jest 3, a m jest 15, to k powinno być 783.*/

        int secondByteLeastRef = 3;
        int leastByteRef = 15;
        int results = 0;
        results += secondByteLeastRef << 8;
        results += leastByteRef;
        System.out.println("secondByteLeastRef: " + secondByteLeastRef + " as binary: " + Integer.toBinaryString(secondByteLeastRef) + " ,leastByteRef: " + leastByteRef + " as binary: " + Integer.toBinaryString(leastByteRef) + " results: " + results);

        /*
        Mając liczbę n zdefiniuj liczbę k, która ma reprezentację bitową taką jak n,
        ale ze wszystkimi bitami drugiego najmniej znaczącego bajtu odwróconymi.
        Na przykład, jeśli n wynosi 65025, to wartość k powinna być 257.
        * */
        int numToRev = 65025;
        int secondLeastByteMask = 0xff << 8;
        int revSecondMask =  numToRev ^ secondLeastByteMask;
        System.out.println("numToRev: " + numToRev + " as binary: " + Integer.toBinaryString(numToRev) + " ,secondLeastByteMask: " + secondLeastByteMask + " as binary: " + Integer.toBinaryString(secondLeastByteMask) + " reversed second byte: " + revSecondMask);

        /*Używając jedynie długopisu i papieru znajdź co zostanie wypisane przez następujący fragment kodu:*/

        byte b = 0x7F;
        System.out.print( (byte)(b << 1) + ": " + Integer.toBinaryString((byte)(b << 1)));
        System.out.print( (byte)(b << 3) + ": " + Integer.toBinaryString((byte)(b << 3)));
        System.out.print( (byte)(b << 5) + ": " + Integer.toBinaryString((byte)(b << 5)));
        System.out.print( (byte)(b << 7) + ": " + Integer.toBinaryString((byte)(b << 7)));
        System.out.print( (byte)(b << 8) + "\n" + Integer.toBinaryString((byte)(b << 8)));

        System.out.print( (b << 1) + ": " + Integer.toBinaryString((b << 1)));
        System.out.print( (b << 3) + ": " + Integer.toBinaryString((b << 3)));
        System.out.print( (b << 5) + ": " + Integer.toBinaryString((b << 5)) );
        System.out.print( (b << 7) + ": " + Integer.toBinaryString((b << 7)));
        System.out.print( (b << 8) + "\n" + Integer.toBinaryString((b << 8)))  ;

    }
}