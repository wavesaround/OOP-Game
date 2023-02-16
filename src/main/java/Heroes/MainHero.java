package Heroes;

import java.util.Random;

public abstract class MainHero implements GameInt {
    protected static Random r;
    protected int hp;
    protected int maxHp;
    protected int runningSpeed;
    protected String name;

    static {
        MainHero.r = new Random();
    }

    public MainHero(String name, int hp, int runningSpeed) {
        this.runningSpeed = runningSpeed;
        this.hp = hp;
        this.maxHp = hp;
        this.name = name;
    }

    public MainHero(String name) {
        this(name, MainHero.r.nextInt(100, 200),
                MainHero.r.nextInt(10,50));
    }
    @Override
    public String getAbout() {
        return String.format("Name: %s  Type: %s  Hp: %d  RS: %d",
                this.name, this.getClass().getSimpleName(), this.hp, this.runningSpeed);
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

    public void getRunningSpeed(int getSpeed) {
        if (getSpeed < 0) getSpeed *= 1;
        this.runningSpeed += getSpeed;
    }
}