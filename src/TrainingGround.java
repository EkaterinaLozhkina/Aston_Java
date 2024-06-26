public class TrainingGround {
    public static void main(String[] args){
        Hero hero = new Hero("Any hero");
        Hero mage = new Mage("Nana");
        Hero warrior = new Warrior("Ruby");
        Hero archer = new Archer("Mia");
        Enemy enemy = new Enemy(100);

        hero.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        warrior.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}
