public class DungeonDoor {
    
    public static void main(String[] args) {

        boolean hasKey = false;
        boolean knowsUnlockSpell = false;

        if (hasKey || knowsUnlockSpell) {
            System.out.println("The door has opened.");
        } else {
            System.out.println("The door is locked.");
        }
    }
}
