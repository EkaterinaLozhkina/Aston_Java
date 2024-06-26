public class TrainingGround {
    public static void main(String[] args){
        Hero hero = new Hero("Any hero");
        Hero mage = new Mage("Nana");
        Hero warrior = new Warrior("Ruby");
        Hero archer = new Archer("Mia");

        hero.attackEnemy();
        mage.attackEnemy();
        warrior.attackEnemy();
        archer.attackEnemy();
    }
}
