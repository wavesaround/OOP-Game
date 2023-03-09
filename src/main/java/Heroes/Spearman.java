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
        if (state.equals("Die")) return;
        ArrayList<MainHero> enemies;
        if(team1.contains(this)) enemies = team2;
        else enemies = team1;

        goAhead(enemies);

        for (MainHero hero:enemies) {
            if (this.distance(hero.bField.x, hero.bField.y) <= 2.0 && hero.hp > 0) {
                double dmg = (hero.def - this.attack) > 0 ? this.damage[0] : this.damage[1];
                hero.getDamage(dmg);
                break;
            }
        }
    }
    private void goAhead(ArrayList<MainHero> enemies){
        if(bField.x + 1 == 10) {
            for (MainHero enemy:enemies) {
                if (enemy.hp > 0 & enemy.bField.y - bField.y == 0) --bField.x;
                if (enemy.hp > 0 & enemy.bField.y - bField.y > 0) --bField.y;
                if (enemy.hp > 0 & enemy.bField.y - bField.y < 0) bField.y++;
            }
            if (bField.y == 11) --bField.y;
            if (bField.y == 0) bField.y++;
        }
        else this.bField.x++;
        for (MainHero hero:enemies) if(this.bField.equals(hero.bField)) {
            --bField.x;
            goAhead(enemies);
        }
    }
}