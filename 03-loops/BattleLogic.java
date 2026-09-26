public class BattleLogic {

    public static void main(String[] args) {
        int enemyHealth = 100;
        int playerDamage = 18; 
        int round = 1;

        while (enemyHealth > 0) {
            enemyHealth -= playerDamage;
            System.out.println("Round: " + round + "\nDamage Dealt: " + playerDamage + "\nRemaining Health: " + enemyHealth);
            round++;

            if (enemyHealth == 0) {
                System.out.println("Enemy defeated!");
            }
        }
    }
    
}
