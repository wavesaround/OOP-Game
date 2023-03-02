package Heroes;

import java.util.ArrayList;

public interface GameInt {

    String getAbout();

    void step(ArrayList<MainHero> team1, ArrayList<MainHero> team2);
}

// метод boolean isLeft(Vector 2D target) {
// return реализация движения в разные стороны
//{