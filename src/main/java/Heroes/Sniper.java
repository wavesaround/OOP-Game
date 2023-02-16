package Heroes;

public class Sniper extends MainHero {
    protected int arrows;
    protected int maxArrows;

    public Sniper(String name) {
        super(name, Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(10,50));
        this.maxArrows = 50;
        this.arrows = maxArrows;
    }
    public String getAbout() {
        return String.format("%s  Arrows: %d", super.getAbout(), this.arrows);
    }
}
