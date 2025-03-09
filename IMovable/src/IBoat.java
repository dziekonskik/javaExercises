public interface IBoat {
    default void Move() {
        System.out.println("Boat swam");
    }
}
