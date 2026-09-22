public class DungeonDoor {
    
    public static void main(String[] args) {

        boolean hasKey = false;
        boolean knowsUnlockSpell = true;

        if (hasKey || knowsUnlockSpell) {
            System.out.println("The door has been opened.");
        } else {
            System.out.println("The door is locked.");
        }
    }
}
