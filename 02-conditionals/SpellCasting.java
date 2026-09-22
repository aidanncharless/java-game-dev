public class SpellCasting {
    public static void main(String[] args) {

        int mana = 10;
        int spellCost = 25;
        boolean hasStaff = true;

        if (mana >= 25 && hasStaff) {
            System.out.println("Cast Fireball!");
            mana -= spellCost;
            System.out.println("Remaining Mana: " + mana);

        } else {
            System.out.println("Cannot cast Fireball.");
            System.out.println("Remaining Mana: " + mana);
        }
    }
}
