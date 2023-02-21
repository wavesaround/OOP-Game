import Heroes.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<MainHero> team1 = newTeam(10, true, 1);
        ArrayList<MainHero> team2 = newTeam(10, false, 10);
        ArrayList<MainHero> sessionStep = team1;
        sessionStep.addAll(team2);
        sortByRS(sessionStep);

        for (MainHero item: sessionStep) { System.out.println(item.getAbout()); }

    }

    /**
     * true = light, false = dark
     * */
    public static ArrayList<MainHero> newTeam(int size, boolean frac, int xStart) {
        ArrayList<MainHero> team = new ArrayList<>();

        for (int i = 1; i < size + 1; i++) {
            switch (new Random().nextInt(1, 5)) {
                case (1):
                    if (frac) team.add(new XBowman(getName(), xStart, i));
                    else team.add(new Sniper(getName(), xStart, i));
                    break;
                case (2):
                    if (frac) team.add(new Monk(getName(), 1, 2));
                    else team.add(new Witch(getName(), xStart, i));
                    break;
                case (3):
                    if (frac) team.add(new Peasant(getName(), xStart, i, "Light"));
                    else team.add(new Peasant(getName(), xStart, i, "Dark"));
                    break;
                case (4):
                    if (frac) team.add(new Spearman(getName(), xStart, i));
                    else team.add(new Robber(getName(), xStart, i));
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

    public static void sortByRS (ArrayList team) {
        team.sort(new Comparator<MainHero>() {
            @Override
            public int compare(MainHero o1, MainHero o2) {
                return o1.getRunningSpeed() - o2.getRunningSpeed();
            }
        });
    }
}
