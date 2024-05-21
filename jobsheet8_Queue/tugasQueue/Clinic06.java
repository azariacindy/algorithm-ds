package tugasQueue;
import java.util.Scanner;

public class Clinic06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum capacity of the queue: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Queue06 clinicQueue = new Queue06(capacity);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print queue");
            System.out.println("4. Peek");
            System.out.println("5. Peek Rear");
            System.out.println("6. Peek Position");
            System.out.println("7. List Patients");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient's ID number: ");
                    int idNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter patient's gender (M/F): ");
                    char gender = scanner.nextLine().charAt(0);
                    System.out.print("Enter patient's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    clinicQueue.enqueue(new Patient06 (name, idNumber, gender, age));
                    break;
                case 2:
                    int dequeuedPosition = clinicQueue.dequeue();
                    if (dequeuedPosition != -1) {
                        System.out.println("Patient dequeued from position " + (dequeuedPosition + 1));
                    }
                    break;
                case 3:
                    clinicQueue.print();
                    break;
                case 4:
                    clinicQueue.peek();
                    break;
                case 5:
                    clinicQueue.peekRear();
                    break;
                case 6:
                    System.out.print("Enter patient's name: ");
                    String patientName = scanner.nextLine();
                    clinicQueue.peekPosition(patientName);
                    break;
                case 7:
                    clinicQueue.listPatients();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}
