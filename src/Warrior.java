public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 15;
        int healthEnemy;
        System.out.printf("The warrior %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        healthEnemy = enemy.getHealth();
        System.out.printf("The enemy %d health point left!\n", healthEnemy);
    }
}
