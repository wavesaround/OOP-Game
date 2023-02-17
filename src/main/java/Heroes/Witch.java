package Heroes;

public class Witch extends MainHero {
    protected int mana;
    protected int maxMana;

    public Witch(String name) {
        super(name, Witch.r.nextInt(100, 200),
                Witch.r.nextInt(10,50));
        this.maxMana = 100;
        this.mana = maxMana;
        this.attack = 2;
        this.def = 2;
        this.damage = new int[]{-15, -15};
        this.runningSpeed = 2;
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s  Mana: %d", super.getAbout(), this.mana);
    }
}
