import java.time.DayOfWeek;
import java.time.LocalDate;

public class GamerCustom implements IGamer {
    private String playerName = "GamerCustom";

    public int play() {
        DayOfWeek dayToday = LocalDate.now().getDayOfWeek();
        return switch (dayToday) {
            case WEDNESDAY -> 1;
            case FRIDAY -> 2;
            default -> 3;
        };
    }

    public String name() {
        return playerName;
    }
}
