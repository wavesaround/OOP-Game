package Heroes;

public class Monk  extends MainHero {
    protected int magic;

    public Monk(String name) {
        super(name, 30, 5);
        this.attack = 2;
        this.def = 2;
        this.damage = new int[]{-4, -4};
        this.magic = 1;
        this.team = "Light";
    }

    public String getAbout() {
        return String.format("%s  Magic: %d", super.getAbout(), this.magic);
    }
}
