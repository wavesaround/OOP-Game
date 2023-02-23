package Heroes;

import java.util.ArrayList;

public class Monk  extends MainHero {
    protected int magic;

    public Monk(String name, int x, int y) {
        super(name, 30, 5, x, y);
        this.attack = 2;
        this.def = 2;
        this.damage = new int[]{-4, -4};
        this.magic = 1;
        this.team = "Light";
    }

    public String getAbout() {
        return String.format("%s  Magic: %d", super.getAbout(), this.magic);
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {

    }
}
