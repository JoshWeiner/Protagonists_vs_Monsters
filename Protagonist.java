/**
 * The player the user will control
 */

public class Protagonist {
    private String name;
    private int hp;
    private int strength;
    private int defense;
    private double attackRating;

    /**
     * standard getter
     * @return the name of the Protagonist
     */

    public String getName() {
        return name;
    }

    /**
     * standard setter
     * @param name the name you want the Protagonist to have
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * standard getter
     * @return the health of the Protagonist
     */

    public int getHp() {
        return hp;
    }

    /**
     * standard setter
     * @param hp the hp you want the Protagonist to have
     */

    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * standard getter
     * @return the strength of the Protagonist
     */

    public int getStrength() {
        return strength;
    }

    /**
     * standard setter
     * @param strength the strength you want the Protagonist to have
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * standard getter
     * @return the defense of the Protagonist
     */

    public int getDefense() {
        return defense;
    }

    /**
     * standard setter
     * @param defense the defense you want the Protagonist to have
     */

    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * standard getter
     * @return the attackRating of the Protagonist
     */

    public double getAttackRating() {
        return attackRating;
    }

    /**
     * standard setter
     * @param attackRating the attackRating you want the Protagonist to have
     */

    public void setAttackRating(double attackRating) {
        this.attackRating = attackRating;
    }

    /**
     * Creates a Protagonist and uses user input to initialize all fields
     * @param name is the name the Protagonist will have
     */

    public Protagonist(String name) {
        setName(name);
        // initializes to a bunch of random values, later maybe use scanner?
        setAttackRating(10);
        setDefense(100);
        setHp(10000);
        setStrength(20);
    }

    /**
     * @return whether the Protagonist is alive or read
     */

    public boolean isAlive() {
        return getHp() > 0;
    }

    /**
     * Sets the hp to the former hp minus the damage
     * @param damage is how much damage to subtract from the hp
     */

    public void lowerHP(int damage) {
        setHp(getHp() - damage);
    }

    /**
     * Lowers the monster's hp by
     * damage = (strength * attack rating) - monster defense
     * Then the monster attacks the player in return
     * @param monster is the monster to attack
     */

    public void attack(Monster monster) {
        int damage = (int) (getStrength() * getAttackRating()) - monster.getDefense();
        if (damage >= 0) {
            monster.lowerHP(damage);
        }
        monster.attack(this);
    }

    /**
     * Prepares the player for a special attack by increasing the damage dealt
     * as well as decreasing defense of the player
     */

    public void specialize() {
        // changes defense and attackRating by arbitrary values, maybe randomize them later?
        setDefense((int) (getDefense() * 0.5));
        setAttackRating(getAttackRating() * 2.0);
    }

    /**
     * Undoes the effects of specialize()
     */

    public void normalize() {
        setDefense(getDefense() * 2);
        setAttackRating(getAttackRating() / 2.0);
    }
}
