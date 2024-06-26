public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 12;
        int healthEnemy;
        System.out.printf("The mage %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        healthEnemy = enemy.getHealth();
        System.out.printf("The enemy %d health point left!\n", healthEnemy);
    }
}
