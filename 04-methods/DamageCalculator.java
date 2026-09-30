public class DamageCalculator {
    public static void main(String[] args) {
        System.out.println(calculatePowerAttack(10) + " damage was dealt!");
        System.out.println(calculatePowerAttack(25) + " damage was dealt!");
        System.out.println(calculatePowerAttack(40) + " damage was dealt!");
    }
    
    public static int calculatePowerAttack(int attack) {

        int powerAttack = attack * 2;
        return powerAttack;
    }
}
