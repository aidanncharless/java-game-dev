public class RPGGame {
    public static void main(String[] args) {

        String playerName = "Kaia";
        String characterClass = "Mage";

        int level = 5;
        int xp = 0;
        
        int playerHealth = 100;
        int maxHealth = 100;
        int healingPotion = 15;

        int mana = 50;
        int manaCost = 12;
        int maxMana = 50;

        int attack = 35;
        int defense = 50;

        int gold = 100;
        int rewardXP = 65;
        int rewardGold = 30;

        int enemyDmg = 24;
        int enemyHealth = 200;

        double movementSpeed = 5.5;

        double criticalMultiplier = 1.5;
        double criticalDamage = attack * criticalMultiplier;


        boolean hasKey = true;
        boolean isAlive = true;

        int round = 1;
    
        System.out.println("GAME STARTS");

        System.out.println("Player has: \n" + maxHealth + " HP\n" + maxMana + " Mana\n" + gold + " Gold\n" + xp + " XP");

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("Round: " + round);
            System.out.println("Kaia acts");
    
            enemyHealth -= attack;

            if (enemyHealth > 0) {

                playerHealth -= enemyDmg;
                System.out.println("Enemy acts";)

                if (playerHealth <= 25) {
                    System.out.println("WARNING: Low health!");
                }

                if (playerHealth <= 0) {
                    isAlive = false;
                    System.out.println("Kaia has fallen. \n GAME OVER");
                }
                
            }
            
            round++;
        }
        
        if (enemyHealth <= 0) {
            System.out.println("Enemy defeated!");
            xp += rewardXP;
            gold += rewardGold;
        } else {
            System.out.println("Enemy survived!");
        }

        
        if (playerHealth < maxHealth && isAlive) {
            playerHealth += healingPotion;

            if (playerHealth > maxHealth) {
                playerHealth = maxHealth;
            }

            System.out.println("Player drinks potion and restores " + healingPotion + " HP");
        }

        if (isAlive && mana >= manaCost) {
            System.out.println("Kaia casts Fireball!");
            mana -= manaCost;
            System.out.println("Player uses " + manaCost + " mana.");
        } else {
            System.out.println("Kaia cannot cast Fireball");
        }


        System.out.println("========================");
        System.out.println("        CHARACTER       ");
        System.out.println("========================");

        System.out.println("Name: " + playerName);
        System.out.println("Class: " + characterClass);

        System.out.println("Level: " + level);
        System.out.println("XP: " + xp);

        System.out.println("HP: " + playerHealth + "/" + maxHealth);
        System.out.println("Mana: " + mana + "/" + maxMana);

        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Gold: " + gold);

        System.out.println("Critical Multiplier: " + criticalMultiplier);
        System.out.println("Critical Damage: " + criticalDamage);
        System.out.println("Movement Speed: " + movementSpeed);

        System.out.println("Has Key: " + hasKey);
        System.out.println("Alive: " + isAlive);

        System.out.println("========================");

    }
    
}
