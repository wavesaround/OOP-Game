package Heroes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class XBowman extends MainHero {
    protected int shots;
    protected int maxShots;

    public XBowman(String name, int x, int y) {
        super(name, 10, 4, x, y);
        this.attack = 6;
        this.def = 3;
        this.maxShots = 16;
        this.shots = maxShots;
        this.damage = new int[]{2, 4};
        this.team = "Light";
    }

    public boolean getArrows(ArrayList<MainHero> allies)  {
        boolean result = false;
        for (MainHero item : allies) {
            if(item instanceof Heroes.Peasant && item.getHp() > 0) {
                item.state = "Busy";
                return true;
            }
        }
        return result;
    }

    public String getAbout() {
        return String.format("%s  Shots: %d", super.getAbout(), this.shots);
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {
        if (state.equals("Die") || shots == 0) return;
        ArrayList<MainHero> enemies;
        ArrayList<MainHero> allies;
        if(team1.contains(this)) { enemies = team2; allies = team1;}
        else { enemies = team1; allies = team2; }

        double minValue = 100;
        double dist;
        MainHero target = enemies.get(0);

        for (MainHero enemy:enemies) {
            dist = enemy.distance(this.bField.x, this.bField.y);
            if(enemy.hp > 0 && dist < minValue) {
                minValue = dist;
                target = enemy;
            }
        }
        double dmg = (target.def - this.attack) > 0 ? this.damage[0] : this.damage[1];
        target.getDamage(dmg);

        this.shots -= this.getArrows(allies) ? 0 : 1;

    }

}