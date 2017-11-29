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
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void lowerHP(int damage) {
        health -= damage;
    }
    
    public void attack(Protagonist person) {
        int damage = (int) (strength * attackRating) - person.getDefense();
        if (damage >=0) {
            person.lowerHP(damage);
        }
    }
    
    public static void main(String[] args) {
        
    }
}