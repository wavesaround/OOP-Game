package Heroes;

public class Witch extends MainHero {
    protected int magic;

    public Witch(String name) {
        super(name, 30, 9);
        this.attack = 17;
        this.def = 12;
        this.damage = new int[]{-5, -5};
        this.magic = 1;
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s  Magic: %d", super.getAbout(), this.magic);
    }
}
