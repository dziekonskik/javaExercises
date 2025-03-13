public class Main {
    public static void main(String[] args) {
        Spiewak s1 = new Spiewak(" Eminem ") {
            @Override
            String spiewaj() {
                return "My name is WHAT? My name is WHO?";
            }
        };
        Spiewak s2 = new Spiewak(" Eagles ") {
            @Override
            String spiewaj() {
                return "Hotel CALIFORNIA, such a lovely place";
            }
        };
        Spiewak s3 = new Spiewak(" Dzem ") {
            @Override
            String spiewaj() {
                return "Whisky, moja ŻONO, wciąż smakuje TAK samo";
            }
        };
        Spiewak sp[] = {s1, s2, s3};
        for (Spiewak s : sp) System.out.println(s);
        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}