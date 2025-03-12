public class GamerRandom implements IGamer {
    private String playerName = "GamerRandom";

    public int play() {
        double shuffle = Math.random() * 100;

        if (shuffle < 33) return 1;
        else if (shuffle < 66) return 2;
        else return 3;
    }

    public String name() {
        return playerName;
    }
}
