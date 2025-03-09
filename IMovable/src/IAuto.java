public interface IAuto {
    default void Move() {
        System.out.println("Auto drove");
    }
}
