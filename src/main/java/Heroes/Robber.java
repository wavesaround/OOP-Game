package Heroes;

public class Robber extends MainHero {
    protected int disguise;
    protected int maxDisguise;

    public Robber(String name) {
        super(name, Robber.r.nextInt(100, 200),
                Robber.r.nextInt(10, 50));
        this.maxDisguise = Robber.r.nextInt(0,11);
        this.disguise = maxDisguise;
        this.attack = 5;
        this.def = 2;
        this.damage = new int[]{10, 25};
        this.runningSpeed = 7;
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s  Disguise: %d", super.getAbout(), this.disguise);
    }
}
