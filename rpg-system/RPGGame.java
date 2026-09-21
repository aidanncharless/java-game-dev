public class RPGGame {
    public static void main(String[] args) {

        String playerName = Kaia;
        String characterClass = Mage;

        int level = 5;
        int xp;
        
        int health;
        int maxHealth;

        int mana;
        int maxMana;

        int attack = 75;
        int defense = 50;

        int gold;

        double criticalChance = 1.5;
        double movementSpeed = 5.5;

        boolean hasKey = true;
        boolean isAlive = true;
    
        System.out.println("GAME STARTS");
        maxHealth = 100;
        maxMana = 50;
        gold = 100;
        xp = 0;

        System.out.println("Player has: \n" + maxHealth + " HP\n" + maxMana + " Mana\n" + gold + " Gold\n" + xp + " XP");

        int enemyDmg = 24;
        maxHealth -= enemyDmg;

        System.out.println("↓");
        System.out.println("Enemy attacks player for " + enemyDmg + " damage");
        System.out.println("↓");
        System.out.println("Player attacks enemy.");
        System.out.println("↓");

        mana = 12;

        System.out.println("Player uses " + mana + " mana.");
        System.out.println("↓");
        System.out.println("Enemy is defeated.");
        System.out.println("↓");

        xp = 65;

        System.out.println("Player receives " + xp + " XP");
        System.out.println("↓");

        gold = 30;

        System.out.println("Player receives " + gold + " gold.");
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
        System.out.println("Movement Speed: " + movementSpeed);

        System.out.println("Has Key: " + hasKey);
        System.out.println("Alive: " + isAlive);

        System.out.println("========================");

    }
    
}
