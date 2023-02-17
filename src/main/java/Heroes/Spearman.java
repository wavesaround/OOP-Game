package Heroes;

public class Spearman extends MainHero {
    protected boolean horse;

    public Spearman(String name) {
        super(name, Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(10, 20));
        this.horse = true;
        this.attack = 6;
        this.def = 4;
        this.damage = new int[]{13, 28};
        this.runningSpeed = 5;
        this.team = "Light";
    }
    public String getAbout() {
        return String.format("%s  Horse: %b", super.getAbout(), this.horse);
    }
}
