public class Enemy implements Mortal {
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
        if(!this.isAlive()){
            health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
