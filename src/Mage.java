public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 12;
        System.out.printf("The mage %s attacks the enemy!\n", this.getName());
        enemy.takeDamage(damage);
        if(enemy.isAlive()){
            System.out.printf("The enemy %d health point left!\n", enemy.getHealth());
        }
        else {
            System.out.println("The enemy is defeated!");
        }
    }
}
