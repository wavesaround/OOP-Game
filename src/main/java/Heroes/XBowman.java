package Heroes;

public class XBowman extends MainHero {
    protected int shots;
    protected int maxShots;

    public XBowman(String name, int x, int y) {
        super(name, 10, 4, x, y);
        this.attack = 6;
        this.def = 3;
        this.maxShots = 16;
        this.shots = maxShots;
        this.damage = new int[]{2, 3};
        this.team = "Light";
    }

    public void Attack (MainHero target) {
        if (shots > 0) {
            target.GetDamage(MainHero.r.nextInt(10, 20));
            this.shots -= 1;
        }
        else target.GetDamage(0);
    }

    public void getArrows(int Arrows)  {
        this.shots = Arrows + this.shots > this.maxShots ? this.maxShots : this.shots + Arrows;
    }

    public String getAbout() {
        return String.format("%s  Arrows: %d", super.getAbout(), this.shots);
    }
}