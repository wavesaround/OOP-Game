package Heroes;

import java.util.ArrayList;

public class Robber extends MainHero {

    public Robber(String name, int x, int y) {
        super(name, 10, 6, x, y);
        this.attack = 8;
        this.def = 3;
        this.damage = new int[]{2, 4};
        this.team = "Dark";
    }

    public String getAbout() {
        return String.format("%s", super.getAbout());
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {

    }
}
