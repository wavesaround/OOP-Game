package Heroes;

public class Peasant extends MainHero {
    protected int delivery;


    public Peasant(String name, String team) {
        super(name, 1, 3);
        this.attack = 1;
        this.def = 1;
        this.damage = new int[]{1, 1};
        this.runningSpeed = 3;
        this.delivery = 1;
        this.team = team;
    }

    public String getAbout() {
        return String.format("%s  Bread: %d", super.getAbout(), this.delivery);
    }
}
