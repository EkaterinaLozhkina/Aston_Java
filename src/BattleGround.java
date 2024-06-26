public class BattleGround {
    public static void main(String[] args){
        Hero mage = new Mage("Nana");
        Enemy enemy = new Enemy(20);

        while(enemy.isAlive()) {
            mage.attackEnemy(enemy);
        }
    }
}
