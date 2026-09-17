// EXERCISE 04 - XP SYSTEM

public class ExperienceCalculator {

    public static void main(String[] args) {

        int playerXP = 350;
        int questXP = 175;
        int enemyXP = 75;

        System.out.println("Starting XP: +" + playerXP);
        System.out.println("Quest Reward: +" + questXP + " XP");
        System.out.println("Enemy Reward: +" + enemyXP + " XP");

        int totalXP = playerXP + questXP + enemyXP;

        System.out.println("Total XP: " + totalXP);

    }
}
