package Heroes;

public class Robber extends MainHero {
    protected int disguise;
    protected int maxDisguise;

    public Robber(String name) {
        super(name, Robber.r.nextInt(100, 200),
                Robber.r.nextInt(10, 50));
        this.maxDisguise = Robber.r.nextInt(0,11);
        this.disguise = maxDisguise;
    }

    public String getAbout() {
        return String.format("%s  Disguise: %d", super.getAbout(), this.disguise);
    }
}
