package assignment06;
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        DoubleLinkedList06 dll = new DoubleLinkedList06();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=========================================");
            System.out.println("Data Manipulation with Double Linked List");
            System.out.println("=========================================");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Print");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.println("=========================================");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    dll.addLast(data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    try {
                        dll.add(data, index);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                    dll.print();
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Enter data to search: ");
                    data = sc.nextInt();
                    if (dll.search(data)) {
                        System.out.println("Data found");
                    } else {
                        System.out.println("Data not found");
                    }
                    break;
                case 9:
                    dll.sortDescending();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
