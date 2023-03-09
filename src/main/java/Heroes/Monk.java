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
        if (state.equals("Die") || magic <= 0) return;
        ArrayList<MainHero> allies;
        if(team1.contains(this)) { allies = team1; }
        else { allies = team2; }

        for (MainHero ally:allies) {
            if(!ally.equals(this) && ally.hp < ally.maxHp && ally.hp > 0) {
                ally.getDamage(this.damage[0]);
                break;
            }
        }
    }
}
