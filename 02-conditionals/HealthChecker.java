public class HealthChecker {
    public static void main(String[] args) {

        int health = 70;

        if (health > 75) {
            System.out.println("Healthy");
        } else if (health > 50) {
            System.out.println("Injured");
        } else if (health > 35) {
            System.out.println("Low Health");
        } else if (health > 20) {
            System.out.println("Critical");
        } else if (health <= 0) {
            System.out.println("Dead");
        }
    }
}
