package Heroes;

public class Sniper extends MainHero {
    protected int shots;

    public Sniper(String name, int x, int y) {
        super(name, 15, 9, x, y);
        this.attack = 12;
        this.def = 10;
        this.shots = 32;
        this.damage = new int[]{8, 10};
        this.team = "Dark";
    }
    public String getAbout() {
        return String.format("%s  Arrows: %d", super.getAbout(), this.shots);
    }
}
