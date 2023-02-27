package Heroes;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Sniper extends MainHero {
    protected int shots;

    public Sniper(String name, int x, int y) {
        super(name, 15, 9, x, y);
        this.attack = 12;
        this.def = 10;
        this.shots = 32;
        this.damage = new int[]{8, 10};
        this.team = "Dark";
    }
    public String getAbout() {
        return String.format("%s  Shots: %d", super.getAbout(), this.shots);
    }

    public boolean getArrows(ArrayList<MainHero> allies)  {
        boolean result = false;
        for (MainHero item : allies) {
            if(item.getClass().getSimpleName().equals("Peasant") & item.getHp() > 0) {
                return true;
            }
        }
        return result;
    }

    @Override
    public void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2) {
        ArrayList<MainHero> enemies;
        ArrayList<MainHero> allies;
        if(team1.contains(this)) { enemies = team2; allies = team1; }
        else { enemies = team1; allies = team2; }

        double minValue = Point2D.distance(
                enemies.get(0).bField.x, enemies.get(0).bField.y, this.bField.x, this.bField.y
                );
        double temp;
        MainHero target = enemies.get(0);

        if(this.hp != 0) {
            for (MainHero enemy:enemies) {
                temp = enemy.distance(this.bField.x, this.bField.y);
                if(temp < minValue) {
                    minValue = temp;
                    target = enemy;
                }
            }

            double dmg = (target.def - this.attack) > 0 ? this.damage[0] : this.damage[1];
            target.getDamage(dmg);

            this.shots -= this.getArrows(allies) ? 0 : 1;
        }
    }
}
