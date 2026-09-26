public class ManaRegen {
    
    public static void main(String[] args) {
        int mana = 10;
        int maxMana = 50;

        while (mana < maxMana) {
            mana += 10;
            System.out.println("Current mana: " + mana);
        }
    }
}
