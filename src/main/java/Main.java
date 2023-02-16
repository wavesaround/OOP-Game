import Heroes.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<MainHero> team = newTeam(10);
        for (MainHero item: team) { System.out.println(item.getAbout()); }

    }
    public static ArrayList<MainHero> newTeam(int size) {
        ArrayList<MainHero> team = new ArrayList<>();

        for (int i = 1; i < size + 1; i++) {
            switch (new Random().nextInt(1, 8)) {
                case (1):
                    team.add(new XBowman(getName()));
                    break;
                case (2):
                    team.add(new Monk(getName()));
                    break;
                case (3):
                    team.add(new Peasant(getName()));
                    break;
                case (4):
                    team.add(new Robber(getName()));
                    break;
                case (5):
                    team.add(new Sniper(getName()));
                    break;
                case (6):
                    team.add(new Spearman(getName()));
                    break;
                case (7):
                    team.add(new Witch(getName()));
                    break;
            }
        }
        return team;
    }
    public static String getName() {
        Random rand = new Random();
        String name = String.valueOf(Names.values()[rand.nextInt(Names.values().length -1)]);
        return name;
    }
}
