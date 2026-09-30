public class DamageCalculator {
    public static void main(String[] args) {
        System.out.println(calculatePowerAttack(35) + " damage was dealt!");
    }
    
    public static int calculatePowerAttack(int attack) {

        int powerAttack = attack * 2;
        return powerAttack;
    }
}
