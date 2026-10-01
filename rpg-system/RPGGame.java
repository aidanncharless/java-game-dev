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
        int bonusDamage = 15;


        boolean hasKey = true;
        boolean isAlive = true;

        int round = 1;
    
        System.out.println("GAME STARTS");

        System.out.println("Player has: \n" + maxHealth + " HP\n" + maxMana + " Mana\n" + gold + " Gold\n" + xp + " XP");

        while (playerHealth > 0 && enemyHealth > 0) {
            System.out.println("Round: " + round);
            System.out.println("Kaia acts");
            

            if (isAlive && canCastSpell(mana, manaCost)) {
                enemyHealth -= calculateFireballDamage(attack, bonusDamage);
                System.out.println("Kaia casts Fireball! " + calculateFireballDamage(attack, bonusDamage) + " damage was dealt.");
                mana -= manaCost;
                System.out.println("Player used " + manaCost + " mana.");
            } else {
                System.out.println("Kaia cannot cast Fireball");
                int damage = calculateAttackDamage(attack);
                enemyHealth -= damage;
                System.out.println("Kaia attacks for " + calculateAttackDamage(attack) + " damage.");
            }

            if (enemyHealth > 0) {

                playerHealth -= enemyDmg;
                System.out.println("Enemy acts");

                if (playerHealth <= 25) {
                    System.out.println("WARNING: Low health!");
                }

                if (playerHealth <= 0) {
                    isAlive = false;
                    System.out.println("Kaia has fallen. \nGAME OVER");
                }
                
            }
            
            round++;
        }
        if (playerHealth < maxHealth && isAlive) {

            playerHealth = useHealingPotion(playerHealth, healingPotion, maxHealth);
            System.out.println("Kaia heals for " + healingPotion + " HP. Her current health is " + playerHealth);
        }
        
        
        if (enemyHealth <= 0) {
            System.out.println("Enemy defeated!");
            xp += rewardXP;
            gold += rewardGold;
        } else {
            System.out.println("Enemy survived!");
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

    public static int calculateAttackDamage(int attack) {
        return attack;
    }

    public static boolean canCastSpell(int mana, int manaCost) {
        return mana >= manaCost;
    }

    public static int calculateFireballDamage(int attack, int bonusDamage) {
        int spellDamage = attack + bonusDamage;
        return spellDamage;
    }

    public static int useHealingPotion(int playerHealth, int healingPotion, int maxHealth) {
        playerHealth += healingPotion; 

        if (playerHealth > maxHealth) {
                playerHealth = maxHealth;
        }

        return playerHealth;
    }
    
    
}
