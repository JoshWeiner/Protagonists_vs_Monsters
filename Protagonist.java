/**
 * The player the user will control
 */

public class Protagonist extends Character {
    protected String name;

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
