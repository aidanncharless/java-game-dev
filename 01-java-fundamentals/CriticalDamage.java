public class CriticalDamage {

    public static void main(String[] args) {

        int baseDamage = 35;
        double criticalMultiplier = 1.5;

        double criticalDamage = baseDamage * criticalMultiplier;


        System.out.println("Base Damage: " + baseDamage);
        System.out.println("Critical Multiplier: " + criticalMultiplier);

        System.out.println("CRITICAL HIT!");

        System.out.println("Damage Dealt: " + criticalDamage);

    }
    
}
