public class HealthChecker {
    public static void main(String[] args) {

        int health = 40;

        if (health <= 100) {
            System.out.println("Healthy");
        } else if (health <= 75) {
            System.out.println("Injured");
        } else if (health <= 40) {
            System.out.println("Low Health");
        } else if (health <= 25) {
            System.out.println("Critical");
        } else if (health <= 0) {
            System.out.println("Dead");
        }
    }
}
