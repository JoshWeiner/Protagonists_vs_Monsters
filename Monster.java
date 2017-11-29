public class Monster {

    private int health;
    private int strength;
    private int defense;
    private double attackRating;
    
    /**
     * Sets the respective fields of monsters to certain values
     */
    
    public Monster() {
        health = 150;
        strength = (int) (Math.random() * 45 + 20);
        defense = 20;
        attackRating = (double) 1;
    }
    
    /**
     * Returns a boolean, false if dead, true if alive
     */
    public boolean isAlive() {
        return health > 0;
    }
    
    /**
     *@Returns the current defense of the Monster
     */
    
    public int getDefense() {
        return defense;
    }
    
    /**
     *@param damage is the value of damage from the method attack(Protagonist Person)
     *Lowers the current HP by the value of damage
     */
    
    public void lowerHP(int damage) {
        health -= damage;
    }
    
    /**
     *The value of damage is calculated (strength * attackRating) - person.getDefense()
     *@param person is the target to attack
     */
    
    public void attack(Protagonist person) {
        int damage = (int) (strength * attackRating) - person.getDefense();
        if (damage >=0) {
            person.lowerHP(damage);
        }
    }
    
    public static void main(String[] args) {
        
    }
}
