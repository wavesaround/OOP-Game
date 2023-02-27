package Heroes;

import java.util.ArrayList;

public class Peasant extends MainHero {

    public Peasant(String name, int x, int y, String team) {
        super(name, 1, 3, x, y);
        this.attack = 1;
        this.def = 1;
        this.damage = new int[]{1, 1};
        this.runningSpeed = 3;
        this.team = team;
    }

    public String getAbout() {
        return String.format("%s", super.getAbout());
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {
        if (!this.state.equals("Die")) this.state = "Stand";
    }
}
