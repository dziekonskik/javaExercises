public class Kontener<T, S> {
    T t;
    S s;

    public Kontener(T t, S s) {
        this.t = t;
        this.s = s;
    }

    void wypisz() {
        System.out.println(t);
        System.out.println(s);
    }
}
