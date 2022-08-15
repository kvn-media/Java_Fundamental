import java.util.Objects;

// implement bisa lebih dari 1 interface
public class Heroes implements HitAble, DefenseAble {
    private String name;
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;


    public Heroes(Integer hp, Integer mana, Integer baseDamage) {
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

    // interface -> method kosong yg bisa dipakai berulang-ulang dengan implementasi
    public void attack(HitAble hitAble) {
        // heroes adalah gatot
        // this.baseDamage itu milik saitama
        hitAble.getHit(this.baseDamage);
    }

    // overloading -> membolehkan method yang sama tetapi parameter yang beda
//    public void attack(Monster monster) {
//        monster.getHit(this.baseDamage);
//    }

    public void getHit(Integer damage) {
        this.hp = hp-damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // (Heroes) -> casting dari object ke Heroes
        Heroes heroes = (Heroes) o;
        return Objects.equals(name, heroes.name) && Objects.equals(hp, heroes.hp) && Objects.equals(mana, heroes.mana) && Objects.equals(baseDamage, heroes.baseDamage);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, hp, mana, baseDamage);
//    }

    //    @Override
//    public String toString() {
//        return "Heroes{" +
//                "name='" + name + '\'' +
//                ", hp=" + hp +
//                ", mana=" + mana +
//                ", baseDamage=" + baseDamage +
//                '}';
//    }

    @Override
    public void getDefense(Integer damage) {

    }
}
