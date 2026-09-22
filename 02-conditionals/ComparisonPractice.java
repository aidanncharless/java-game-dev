// LAB 02A COMPARISON PRACTICE

public class ComparisonPractice {

    public static void main (String[] args) {

        int health = 60;
        int mana = 30;
        int gold = 150;
        int level = 5;

        if (health > 50) {
            System.out.println("true");
        }

        if (mana == 30) {
            System.out.println("true");
        }

        if (gold < 100) {
            System.out.println("false");
        }

        if (level >= 5) {
            System.out.println("true");
        }

        if (health == 100) {
            System.out.println("false");
        }

        if (mana != 0) {
            System.out.println("true");
        }
    }
}