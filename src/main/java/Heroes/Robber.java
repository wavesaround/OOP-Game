package Heroes;

public class Robber extends MainHero {
    protected int disguise;

    public Robber(String name) {
        super(name, 10, 6);
        this.attack = 8;
        this.def = 3;
        this.damage = new int[]{2, 4};
        this.disguise = 5;
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s  Disguise: %d", super.getAbout(), this.disguise);
    }
}
