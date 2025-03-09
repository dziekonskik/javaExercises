public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void sayHelloTo(Hero hero) {
        System.out.println("Hi " + hero.name + " !");
    }

    public String getName() {
        return this.name;
    }
}
