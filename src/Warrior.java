public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 15;
        System.out.printf("The warrior %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        if(enemy.isAlive()){
            System.out.printf("The enemy %d health point left!\n", enemy.getHealth());
        }
        else {
            System.out.println("The enemy is defeated!");
        }
    }
}
