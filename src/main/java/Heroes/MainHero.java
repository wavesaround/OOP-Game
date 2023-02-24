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
        return String.format("Team: %s  Name: %s  Type: %s  Hp: %d  RS: %d  State: %s",
                this.team, this.name, this.getClass().getSimpleName(), this.hp, this.runningSpeed, this.state);
    }

    public int getHp() {
        return hp;
    }

    public void getHp(int Hp) {
        if (Hp < 0) Hp *= 1;
        if (this.hp + Hp > this.maxHp) this.hp = this.maxHp;
        else this.hp += Hp;
    }

    public void GetDamage (int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
        if (this.hp > this.maxHp) this.hp = this.maxHp;
        if (this.hp <= 0) this.state = "Die";
    }

//    public void Attack (MainHero target) {
//        target.GetDamage(MainHero.r.nextInt(10,20));
//    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

}

