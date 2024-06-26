public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy){
        int damage = 10;
        int healthEnemy;
        System.out.printf("The hero %s attacks the enemy!\n", name);
        enemy.takeDamage(damage);
        healthEnemy = enemy.getHealth();
        System.out.printf("The enemy %d health point left!\n", healthEnemy);
    }
}
