public class SpellCalculator {
    public static void main(String[] args) {
        System.out.println(calculateSpellDamage(35, 1.75));
        System.out.println(calculateSpellDamage(60, 2.0));
        System.out.println(calculateSpellDamage(10, 1.5));
    }

    public static double calculateSpellDamage(int baseDamage, double multiplier) {
        double spellDamage = baseDamage * multiplier;
        return spellDamage;
    }
}
