public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 13;
        System.out.printf("The archer %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        if(enemy.isAlive()){
            System.out.printf("The enemy %d health point left!\n", enemy.getHealth());
        }
        else {
            System.out.println("The enemy is defeated!");
        }
    }
}
