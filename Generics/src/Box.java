public class Box<T extends Number> {
    private T field;

    public Box(T field) {
        this.field = field;
    }

    public void setValue(T newValue) {
        this.field = newValue;
    }

    public double getDoubleValue() {
        return (Double) field;
    }
}
