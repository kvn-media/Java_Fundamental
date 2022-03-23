package Basic.entity;

public class Heroes {

    private String name;
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;


    public Heroes(Integer hp, Integer mana, Integer baseDamage) {
//        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

    public void attack(Heroes heroes) {
        heroes.getHit(this.baseDamage);
    }

    public void getHit(Integer damage) {
        this.hp = hp-damage;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
