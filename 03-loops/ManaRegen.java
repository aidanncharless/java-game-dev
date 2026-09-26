public class ManaRegen {
    
    public static void main(String[] args) {
        int mana = 10;
        int maxMana = 50;

        while (mana < maxMana) {
            System.out.println("Current mana: " + mana);
            mana += 10;
        }
    }
}
