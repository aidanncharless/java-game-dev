// LAB 01 RPG CHARACTER SHEET
// EXERCISE 02 - TAKING DAMAGE

public class DamageCalculator {

    public static void main(String[] args) {

        int playerHealth = 100;
        int damageTaken = 23;

        playerHealth -= damageTaken;

        System.out.println("The enemy attacks!");
        System.out.println("");
        System.out.println("Damage taken: " + damageTaken);
        System.out.println("Remaining HP: " + playerHealth);

        int healingPotion = 15;
        playerHealth += healingPotion;

        System.out.println("Player drinks potion.");
        System.out.println("Recovered HP: " + healingPotion + "HP");
        System.out.println("Current HP: " + playerHealth);


    }
}