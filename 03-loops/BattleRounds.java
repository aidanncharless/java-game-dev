public class BattleRounds {
    
    public static void main(String[] args) {
        
        int playerHealth = 100;
        int enemyDamage = 18; 
        int round = 1;

        while (playerHealth > 0) {
            playerHealth -= enemyDamage;
            System.out.println("Round: " + round + "\nDamage Dealt: " + enemyDamage + "\nRemaining Health: " + playerHealth);
            round++;
        }

    }
}
