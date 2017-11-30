/**
 * Protagonists and Monsters are characters
 */
public class Character {

    private int hp;
    private int strength;
    private int defense;
    private double attackRating;

    /**
     * standard getter
     * @return the health of the Character
     */

    public int getHp() {
        return hp;
    }

    /**
     * standard setter
     * @param hp the hp you want the Character to have
     */

    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * standard getter
     * @return the strength of the Character
     */

    public int getStrength() {
        return strength;
    }

    /**
     * standard setter
     * @param strength the strength you want the Character to have
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * standard getter
     * @return the defense of the Character
     */

    public int getDefense() {
        return defense;
    }

    /**
     * standard setter
     * @param defense the defense you want the Character to have
     */

    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * standard getter
     * @return the attackRating of the Character
     */

    public double getAttackRating() {
        return attackRating;
    }

    /**
     * standard setter
     * @param attackRating the attackRating you want the Character to have
     */

    public void setAttackRating(double attackRating) {
        this.attackRating = attackRating;
    }

    /**
     * @return whether the Character is alive or read
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
     * Lowers the other character's hp by
     * damage = (strength * attack rating) - other character defense
     * if the damage is less than 0, it inflicts 0 damage
     * @param character is the character to attack
     * @return the damage dealt
     */

    public int attack(Character character) {
        int damage = (int) (getStrength() * getAttackRating()) - character.getDefense();
        if (damage >= 0) {
            character.lowerHP(damage);
            return damage;
        }
        return 0;
    }



}
