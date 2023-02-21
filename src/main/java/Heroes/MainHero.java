package Heroes;

import java.util.ArrayList;
import java.util.Random;

public abstract class MainHero implements GameInt {
    protected static Random r;
    protected int attack;
    protected int def;
    protected int[] damage;
    protected int hp;
    protected int maxHp;
    protected int runningSpeed;
    protected String name;
    protected String team;
    protected Field field;

    static {
        MainHero.r = new Random();
    }

    public MainHero(String name, int hp, int runningSpeed, int x, int y) {
        this.runningSpeed = runningSpeed;
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.field = new Field(x, y);
    }

//    public MainHero(String name, int x, int y) {
//        this(name, MainHero.r.nextInt(100, 200),
//                MainHero.r.nextInt(10,50));
//
//    }
    public void findTarget(ArrayList<MainHero> enemies) {

    }

    @Override
    public String getAbout() {
        return String.format("Team: %s  Name: %s  Type: %s  Hp: %d  RS: %d",
                this.team, this.name, this.getClass().getSimpleName(), this.hp, this.runningSpeed);
    }

    @Override
    public void Step() {
        System.out.println("Здесь пока ничего нет");
    }

    public void getHp(int Hp) {
        if (Hp < 0) Hp *= 1;
        if (this.hp + Hp > this.maxHp) this.hp = this.maxHp;
        else this.hp += Hp;
    }

    public void GetDamage (int damage) {
        if (this.hp - damage > 0) this.hp -= damage;
        else this.hp = 0;
    }

    public void Attack (MainHero target) {
        target.GetDamage(MainHero.r.nextInt(10,20));
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }
}
