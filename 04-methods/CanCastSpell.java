public class CanCastSpell {
    public static void main(String [] args) {
        if (canCastSpell(50, 12)) {
            System.out.println("Fireball is casted!");
        } else {
            System.out.println("Mana is insufficient.");
        }
    }

    public static boolean canCastSpell(int mana, int manaCost) {
        return mana >= manaCost;
    }
}
