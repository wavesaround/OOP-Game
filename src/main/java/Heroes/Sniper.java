package Heroes;

public class Sniper extends MainHero {
    protected int arrows;
    protected int maxArrows;

    public Sniper(String name) {
        super(name, Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(10,50));
        this.maxArrows = 50;
        this.arrows = maxArrows;
        this.attack = 7;
        this.def = 2;
        this.damage = new int[]{15, 35};
        this.runningSpeed = 4;
        this.team = "Dark";
    }
    public String getAbout() {
        return String.format("%s  Arrows: %d", super.getAbout(), this.arrows);
    }
}
