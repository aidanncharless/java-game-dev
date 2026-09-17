// LAB 01 RPG CHARACTER SHEET
// EXERCISE 02 - TAKING DAMAGE

public class DamageCalculator {

    public static void main(String[] args) {

        int playerHealth = 100;
        int damageTaken = 23;

        playerHealth -= damageTaken;

        System.out.println("The enemy attacks!");
        System.out.println("Damage taken: " + damageTaken);
        System.out.println("Remaining HP: " + playerHealth);

        
    }
}