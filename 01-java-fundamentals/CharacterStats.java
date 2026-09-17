// LAB 01 RPG CHARACTER SHEET
// EXERCISE 01 - CREATE YOUR CHARACTER

public class CharacterStats {

    public static void main(String[] args) {

        String playerName = "Kaia";
        String characterClass = "Mage";
        int level = 5;
        int health = 100;
        int mana = 200;
        int gold = 150;
        double movementSpeed = 5.5;
        boolean isAlive = true;

        System.out.println("========================");
        System.out.println("        CHARACTER       ");
        System.out.println("========================");

        System.out.println("Name: " + playerName);
        System.out.println("Class: " + characterClass);
        System.out.println("Level: " + level);

        System.out.println("HP: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Gold: " + gold);

        System.out.println("Movement Speed: " + movementSpeed);
        System.out.println("Alive: " + isAlive);

    }
}