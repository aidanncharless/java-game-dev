public class RPGGame {
    public static void main(String[] args) {

        String playerName = "Kaia";
        String characterClass = "Mage";

        int level = 5;
        int xp;
        
        int health = 100;
        int maxHealth;

        int mana = 50;
        int manaCost;
        int maxMana;

        int attack = 35;
        int defense = 50;

        int gold;

        double movementSpeed = 5.5;

        double criticalMultiplier = 1.5;
        double criticalDamage = attack * criticalMultiplier;


        boolean hasKey = true;
        boolean isAlive = true;
    
        System.out.println("GAME STARTS");
        maxHealth = 100;
        maxMana = 50;
        gold = 100;
        xp = 0;

        System.out.println("Player has: \n" + maxHealth + " HP\n" + maxMana + " Mana\n" + gold + " Gold\n" + xp + " XP");

        int enemyDmg = 24;
        health -= enemyDmg;

        System.out.println("↓");
        System.out.println("Enemy attacks player for " + enemyDmg + " damage.");
        System.out.println("↓");
        System.out.println("Player attacks enemy.");
        System.out.println("↓");

        manaCost = 12;

        if (isAlive && mana >= manaCost) {
            System.out.println("Kaia casts Fireball!");
            mana -= manaCost;
            System.out.println("Player uses " + manaCost + " mana.");
        } else {
            System.out.println("Kaia cannot cast Fireball");
        }

        int enemyHealth = 60;

        enemyHealth -= attack;
        int rewardXP = 65;
        int rewardGold = 30;
        
        if (enemyHealth <= 0) {
            System.out.println("Enemy defeated!");
            xp += rewardXP;
            gold += rewardGold;
        } else {
            System.out.println("Enemy survived!");
        }

        if (health <= 25) {
            System.out.println("WARNING: Low health!");
        }

        if (health <= 0) {
            isAlive = false;
            System.out.println("Kaia has fallen. \n GAME OVER");
        }
        
        int healingPotion = 15;

        if (health < maxHealth && isAlive) {
            health += healingPotion;

            if (health > maxHealth) {
                health = maxHealth;
            }

            System.out.println("Player drinks potion and restores " + healingPotion + " HP");
        }


        System.out.println("Player drinks potion and restores " + healingPotion + " HP");

        System.out.println("========================");
        System.out.println("        CHARACTER       ");
        System.out.println("========================");

        System.out.println("Name: " + playerName);
        System.out.println("Class: " + characterClass);

        System.out.println("Level: " + level);
        System.out.println("XP: " + xp);

        System.out.println("HP: " + health + "/" + maxHealth);
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
