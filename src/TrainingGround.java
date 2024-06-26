public class TrainingGround {
    public static void main(String[] args){
        Hero mage = new Mage("Nana");
        Hero warrior = new Warrior("Ruby");
        Hero archer = new Archer("Mia");
        Enemy enemy = new Enemy(100);

        mage.attackEnemy(enemy);
        warrior.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}
