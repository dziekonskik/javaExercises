public class Container<T> {
    private T element;

    public Container(T element) {
        this.element = element;
    }

    void add(T element) {
        this.element = element;
    }

    T get() {
        return this.element;
    }
}
