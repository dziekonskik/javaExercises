import java.util.Iterator;

public class InterNap implements Iterable<Character> {
    private String chars;
    int currentIteration = 0;
    int step = 1;

    public InterNap(String chars) {
        this.chars = chars;
    }

    @Override
    public Iterator<Character> iterator() {

        return new Iterator<Character>() {
            @Override
            public boolean hasNext() {
                return currentIteration + step < chars.length();
            }

            @Override
            public Character next() {
                currentIteration++;
                return chars.charAt(currentIteration);
            }
        };
    }
}
