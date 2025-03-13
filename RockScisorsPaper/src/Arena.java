public class Arena {
    private IGamer player1;
    private IGamer player2;
    private int score1 = 0;
    private int score2 = 0;

    public Arena(IGamer player1, IGamer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight(int numberOfRounds) {
        for (int round = 1; round <= numberOfRounds; round++) {
            System.out.println("Runda " + round + ":");

            int move1 = player1.play();
            int move2 = player2.play();

            System.out.println("zagrano: " + getMoveName(move1) + " na " + getMoveName(move2));

            // Sprawdzamy wynik rundy
            if (move1 == move2) {
                System.out.println("Remis");
            } else if ((move1 == 1 && move2 == 3) || (move1 == 2 && move2 == 1) || (move1 == 3 && move2 == 2)) {
                System.out.println("Wygral gracz: " + player1.name());
                score1++;
            } else {
                System.out.println("Wygral gracz: " + player2.name());
                score2++;
            }
        }

        System.out.println("\nWynik po rozegraniu " + numberOfRounds + " rund:");
        System.out.println(player1.name() + " wynik: " + score1);
        System.out.println(player2.name() + " wynik: " + score2);
        if (score1 > score2) {
            System.out.println("Wygrywa gracz: " + player1.name());
        } else if (score2 > score1) {
            System.out.println("Wygrywa gracz: " + player2.name());
        } else {
            System.out.println("Remis");
        }
    }

    private String getMoveName(int move) {
        switch (move) {
            case 1:
                return "Kamien";
            case 2:
                return "Papier";
            case 3:
                return "Nozyce";
            default:
                return "Nieznany ruch";
        }
    }

}
