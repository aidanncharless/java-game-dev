public class AttackMessage {
    public static void main(String[] args) {
        showAttack("Kaia", 35);
        showAttack("Hanni", 70);
        showAttack("Suheil", 50);
    }

    public static void showAttack(String playerName, int attackDamage) {
        System.out.println(playerName + " deals " + attackDamage + " damage.");
    }
}
// parameters make a method reusable because it keeps the instructions for the task that needs to be done, however it can utilize different and multiple pieces of information for the same task.
// it's also more efficient for doing so!
