package Heroes;

import java.util.ArrayList;

public class Spearman extends MainHero {

    public Spearman(String name, int x, int y) {
        super(name, 10, 4, x, y);
        this.attack = 4;
        this.def = 5;
        this.damage = new int[]{1, 3};
        this.team = "Light";
    }
    public String getAbout() {
        return String.format("%s", super.getAbout());
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {

    }
}
