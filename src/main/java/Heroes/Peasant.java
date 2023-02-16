package Heroes;

public class Peasant extends MainHero {
    protected int bread;
    protected int maxBread;

    public Peasant(String name) {
        super(name, Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(10, 50));
        this.maxBread = Peasant.r.nextInt(10,30);
        this.bread = maxBread;
    }

    public String getAbout() {
        return String.format("%s  Bread: %d", super.getAbout(), this.bread);
    }
}
