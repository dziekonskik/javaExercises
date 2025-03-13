public class Main {
    public static void main(String[] args) {
        IGamer gamer1 = new GamerScisors();
        IGamer gamer2 = new GamerRandom();

        Arena arena = new Arena(gamer1, gamer2);
        arena.fight(10000);
    }
}