package Heroes;

public class Monk  extends MainHero {
    protected int mana;
    protected int maxMana;

    public Monk(String name) {
        super(name, Monk.r.nextInt(100, 200),
                Monk.r.nextInt(10,50));
        this.maxMana = 100;
        this.mana = maxMana;
        this.attack = 2;
        this.def = 2;
        this.damage = new int[]{-15, -15};
        this.runningSpeed = 3;
        this.team = "Light";
    }

    public String getAbout() {
        return String.format("%s  Mana: %d", super.getAbout(), this.mana);
    }
}
