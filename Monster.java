public class Monster extends Character{
    
    /**
     * Sets the respective fields of monsters to certain values
     */
    
    public Monster() {
        setHp(150);
        setStrength((int) (Math.random() * 45 + 20));
        setDefense(20);
        setAttackRating(1.0);
    }

}
