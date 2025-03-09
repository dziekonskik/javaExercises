public class Squad {
    private final String name;
    private final Hero[] members = new Hero[10];
    private Leader leader;
    private int heroCount = 0;

    public Squad(String name) {
        this.name = name;
    }

    public void addHero(Hero hero) throws TooManyHeroesException {
        if (heroCount > 0) throw new TooManyHeroesException("Too many heroes!!!");

        members[heroCount] = hero;
        heroCount++;
    }

    public void setLeader(Leader newLeader) {
        this.leader = newLeader;
    }

    @Override
    public String toString() {
        String heroesNames = "";

        for (Hero hero : members) {
            if (hero != null) {
                heroesNames += hero.getName() + " ";
            }
        }

        return this.name + " leader:" + this.leader.getName() + ", heroes: " + this.members[0].getName();
    }
}
