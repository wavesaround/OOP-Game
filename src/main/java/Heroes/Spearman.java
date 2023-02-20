package Heroes;

public class Spearman extends MainHero {
    protected boolean horse;

    public Spearman(String name) {
        super(name, 10, 4);
        this.attack = 4;
        this.def = 5;
        this.damage = new int[]{1, 3};
        this.team = "Light";
        this.horse = true;
    }
    public String getAbout() {
        return String.format("%s  Horse: %b", super.getAbout(), this.horse);
    }
}
