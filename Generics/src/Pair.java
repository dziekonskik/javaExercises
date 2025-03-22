public class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }

    Pair<U, T> swap() {
        return new Pair<>(this.second, this.first);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
        int foundGreaterThan = 0;

        for (T item : array) {
            if (item.compareTo(element) > 0) foundGreaterThan++;
        }

        return foundGreaterThan;
    }
}
