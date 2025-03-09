import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Satelite {
    String name;
    int weight;

    Satelite(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    static Satelite makeSatelites(String inputPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(";")) {
                    Pattern pattern = Pattern.compile("^(.*?);\\s*(\\d+)$");
                    Matcher matcher = pattern.matcher(line);
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Satelite("A", 11);
    }

}
