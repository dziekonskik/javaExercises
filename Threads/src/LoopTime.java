public class LoopTime {
    static int iterationsCount = 1000000;

    static void measure() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterationsCount; i++) {
            System.out.print(i);
        }
        long finish = System.currentTimeMillis();

        System.out.println("Done in: " + (finish - start));
    }

    static void measureEven() {
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < iterationsCount; i++) {
                if (i % 2 == 0) System.out.println(i);
            }
            long finish = System.currentTimeMillis();

            System.out.println("Even Done in: " + (finish - start));
        }).start();
    }

    static void measureOdd() {
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (int i = 0; i < iterationsCount; i++) {
                if (i % 2 != 0) System.out.println(i);
            }
            long finish = System.currentTimeMillis();

            System.out.println("Odd Done in: " + (finish - start));
        }).start();
    }
}
