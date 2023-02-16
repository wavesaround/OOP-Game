package Heroes;

public class XBowman extends MainHero {
    protected int arrows;
    protected int maxArrows;

    public XBowman(String name) {
        super(name, XBowman.r.nextInt(100, 200),
                XBowman.r.nextInt(10,50));
        this.maxArrows = 50;
        this.arrows = maxArrows;
    }

    public void Attack (MainHero target) {
        if (arrows > 0) {
            target.GetDamage(MainHero.r.nextInt(10, 20));
            this.arrows -= 1;
        }
        else target.GetDamage(0);
    }

    public void getArrows(int Arrows)  {
        this.arrows = Arrows + this.arrows > this.maxArrows ? this.maxArrows : this.arrows + Arrows;
    }

    public String getAbout() {
        return String.format("%s  Arrows: %d", super.getAbout(), this.arrows);
    }
}
