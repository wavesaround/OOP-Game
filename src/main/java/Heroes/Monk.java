package Heroes;

public class Monk  extends MainHero {
    protected int mana;
    protected int maxMana;

    public Monk(String name) {
        super(name, Monk.r.nextInt(100, 200),
                Monk.r.nextInt(10,50));
        this.maxMana = 100;
        this.mana = maxMana;
    }

    public String getAbout() {
        return String.format("%s  Mana: %d", super.getAbout(), this.mana);
    }
}
