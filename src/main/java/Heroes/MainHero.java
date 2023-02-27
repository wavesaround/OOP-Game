package Heroes;

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
    protected Battlefield bField;

    public String state;
    static {
        MainHero.r = new Random();
    }

    public MainHero(String name, int hp, int runningSpeed, int x, int y) {
        this.runningSpeed = runningSpeed;
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
        this.bField = new Battlefield(x, y);
        state = "Stand";
    }

    @Override
    public String getAbout() {
        return String.format("Position: %-7s  Team: %-5s  Name: %-8s  Type: %-8s  Hp: %-2d  RS: %-1d  State: %-7s",
                this.bField, this.team, this.name, this.getClass().getSimpleName(), this.hp, this.runningSpeed, this.state);
    }

    public int getHp() {
        return hp;
    }

    public void getHp(int Hp) {
        if (Hp < 0) Hp *= 1;
        if (this.hp + Hp > this.maxHp) this.hp = this.maxHp;
        else this.hp += Hp;
    }

    public void getDamage(double damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        if (this.hp > this.maxHp) this.hp = this.maxHp;
        if (this.hp <= 0) this.state = "Die";
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public double distance(double x2, double y2)
    {
        int x1 = this.bField.x;
        int y1 = this.bField.y;
        x1 -= x2;
        y1 -= y2;
        return (Math.sqrt(x1 * x1 + y1 * y1)) * 1;
    }
}

