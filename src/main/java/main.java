import Heroes.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class main {
    static final int UNITS = 10;
    public static ArrayList<MainHero> holyTeam;
    public static ArrayList<MainHero> darkTeam;
    public static ArrayList<MainHero> teams = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Press Enter to begin");
        user_input.nextLine();
        holyTeam = newTeam(UNITS, true, 1);
        darkTeam = newTeam(UNITS, false, 10);
        teams.addAll(holyTeam);
        teams.addAll(darkTeam);
        sortByRS(teams);

        while (true) {
            View.view();
            user_input.nextLine();
            teams.forEach(mainHero -> mainHero.step(holyTeam, darkTeam));
        }
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
                    if (frac) team.add(new Monk(getName(), xStart, i));
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
                return o2.getRunningSpeed() - o1.getRunningSpeed();
            }
        });
    }
}
