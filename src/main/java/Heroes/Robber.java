package Heroes;

import java.util.ArrayList;

public class Robber extends MainHero {
    protected int disguise;

    public Robber(String name, int x, int y) {
        super(name, 10, 6, x, y);
        this.attack = 8;
        this.def = 3;
        this.damage = new int[]{2, 4};
        this.disguise = 5;
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s  Disguise: %d", super.getAbout(), this.disguise);
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {

    }
}
