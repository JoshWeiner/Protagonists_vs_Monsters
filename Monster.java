public class Monster {

    private int health;
    private int strength;
    private int defense;
    private double attackRating;
    
    public Monster() {
        health = 150;
        strength = (int) (Math.random() * 45 + 20);
        defense = 20;
        attackRating = (double) 1;
    }
    
    private boolean isAlive() {
        if (health <= 0) {
            return false;
        }
        return true;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public int lowerHP(int damage) {
        health -= damage;
        return health;
    }
    
    public int attack(Protagonist person) {
        int damage = 0;
        damage = (int) (strength * attackRating) - person.getDefense();
        return damage;
    }
    
    public static void main(String[] args) {
        
    }
}