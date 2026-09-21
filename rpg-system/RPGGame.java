public class RPGGame {
    public static void main(String[] args) {

        String playerName = "Kaia";
        String characterClass = "Mage";

        int level = 5;
        int xp;
        
        int health = 100;
        int maxHealth;

        int mana;
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
        mana = maxMana - manaCost;

        System.out.println("Player uses " + mana + " mana.");
        System.out.println("↓");
        System.out.println("Enemy is defeated.");
        System.out.println("↓");

        int rewardXP = 65;

        System.out.println("Player receives " + rewardXP + " XP");
        System.out.println("↓");

        int rewardGold = 30;

        System.out.println("Player receives " + rewardGold + " gold.");
        System.out.println("↓");
        
        int healingPotion = 15;

        health += healingPotion;

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

        System.out.println("Critical Chance: " + criticalChance);
        System.out.println("Critical Damage: " + criticalDamage);
        System.out.println("Movement Speed: " + movementSpeed);

        System.out.println("Has Key: " + hasKey);
        System.out.println("Alive: " + isAlive);

        System.out.println("========================");

    }
    
}
