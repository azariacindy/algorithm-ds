import java.util.Scanner;

public class assignment206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose the formula to calculate:");
            System.out.println("1. Speed");
            System.out.println("2. Distance");
            System.out.println("3. Time");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSpeed(scanner);
                    break;
                case 2:
                    calculateDistance(scanner);
                    break;
                case 3:
                    calculateTime(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void calculateSpeed(Scanner scanner) {
        System.out.print("Enter distance (in meters): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter time (in seconds): ");
        double time = scanner.nextDouble();
        double speed = distance / time;
        System.out.printf("Speed: %.2f m/s\n", speed);
    }

    private static void calculateDistance(Scanner scanner) {
        System.out.print("Enter speed (in m/s): ");
        double speed = scanner.nextDouble();
        System.out.print("Enter time (in seconds): ");
        double time = scanner.nextDouble();
        double distance = speed * time;
        System.out.printf("Distance: %.2f meters\n", distance);
    }

    private static void calculateTime(Scanner scanner) {
        System.out.print("Enter distance (in meters): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter speed (in m/s): ");
        double speed = scanner.nextDouble();
        double time = distance / speed;
        System.out.printf("Time: %.2f seconds\n", time);
    }
}
