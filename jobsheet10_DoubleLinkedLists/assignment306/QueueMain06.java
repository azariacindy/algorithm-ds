package assignment306;
import java.util.Scanner;

public class QueueMain06 {
    public static void main(String[] args) {
        Queue06 queue = new Queue06();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("      Extravaganza Vaccine Queue     ");
            System.out.println("=====================================");
            System.out.println("1. Add Vaccine queue");
            System.out.println("2. Remove Vaccine queue");
            System.out.println("3. Display vaccine queue");
            System.out.println("4. Exit");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter queue number: ");
                    int queueNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name to add to vaccine queue: ");
                    String name = sc.nextLine();
                    queue.enqueue(queueNumber, name);
                    break;
                case 2:
                    try {
                        Node06 removedPerson = queue.dequeue();
                        System.out.println("Recently vaccinated person: Queue Number: " + removedPerson.queueNumber + ", Name: " + removedPerson.name);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
