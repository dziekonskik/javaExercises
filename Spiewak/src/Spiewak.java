public abstract class Spiewak {
    String name;
    static int counter = 0;
    int id;

    public Spiewak(String name) {
        this.name = name;
        this.id = counter;
        counter++;
    }

    abstract String spiewaj();

    @Override
    public String toString() {
        return "Spiewak name: " + name + " id: " + id;
    }

    private static long countUppercase(String text) {
        return text.chars().filter(Character::isUpperCase).count();
    }

    static Spiewak najglosniej(Spiewak[] spiewakArr) {
        if (spiewakArr == null || spiewakArr.length == 0) {
            return null; // Zwracamy null dla pustej lub null tablicy
        }
        Spiewak loudestSpiewak = spiewakArr[0];
        for (Spiewak spiewak : spiewakArr) {
            if (countUppercase(spiewak.spiewaj()) > countUppercase(loudestSpiewak.spiewaj())) {
                loudestSpiewak = spiewak;
            }
        }
        return loudestSpiewak;
    }
}
