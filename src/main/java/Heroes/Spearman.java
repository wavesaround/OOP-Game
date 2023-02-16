package Heroes;

public class Spearman extends MainHero {
    protected boolean horse;

    public Spearman(String name) {
        super(name, Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(10, 20));
        horse = true;
    }
    public String getAbout() {
        return String.format("%s  Horse: %b", super.getAbout(), this.horse);
    }
}
