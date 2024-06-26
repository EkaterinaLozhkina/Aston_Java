public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 13;
        int healthEnemy;
        System.out.printf("The archer %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        healthEnemy = enemy.getHealth();
        System.out.printf("The enemy %d health point left!\n", healthEnemy);
    }
}
