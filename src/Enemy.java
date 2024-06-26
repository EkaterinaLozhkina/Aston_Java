public class Enemy {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        health = health - damage;
        System.out.printf("The enemy received %d points of damage.\n", damage);
    }
}
