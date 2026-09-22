public class HealthChecker {
    public static void main(String[] args) {

        int health = 10;
        if (health >= 75) {
            System.out.println("Healthy");
        } else if (health >= 50) {
            System.out.println("Injured");
        } else if (health >= 25) {
            System.out.println("Low Health");
        } else if (health >= 1) {
            System.out.println("Critical");
        } else {
            System.out.println("Dead");
        }
        
    }
}
