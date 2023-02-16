package Heroes;

public class Witch extends MainHero {
    protected int mana;
    protected int maxMana;

    public Witch(String name) {
        super(name, Witch.r.nextInt(100, 200),
                Witch.r.nextInt(10,50));
        this.maxMana = 100;
        this.mana = maxMana;
    }

    public String getAbout() {
        return String.format("%s  Mana: %d", super.getAbout(), this.mana);
    }
}
