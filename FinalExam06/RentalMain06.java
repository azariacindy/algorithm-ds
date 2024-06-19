package FinalExam06;
import java.util.Scanner;

public class RentalMain06 {
    private static RentalItems06[] rentalItemsList = new RentalItems06[50];
    private static RentalTransactions06[] rentalTransactionList = new RentalTransactions06[50];
    private static int rentalItemsCount = 0;
    private static int rentalTransactionsCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addRentalItem();
                    break;
                case 2:
                    displayRentalItems();
                    break;
                case 3:
                    recordRentalTransaction ();
                    break;
                case 4:
                    displayRentalTransactions();
                    break;
                case 5:
                    sortTransactionsByTNKB();
                break;
                case 6:
                    System.out.println("~Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again....");
            }
        }
    }

    // displays the main menu
    private static void displayMenu() {
        System.out.println("\nAzaria's Rental Menu");
        System.out.println("1. Add Rental Item");
        System.out.println("2. Display Rental Items");
        System.out.println("3. Loan");
        System.out.println("4. Display All Rental Transactions");
        System.out.println("5. Sort Transactions in order of TNKB number");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    // add a rental item
    private static void addRentalItem() {
        System.out.print("Enter TNKB Number: ");
        String TNKBNumber = scanner.nextLine();
        System.out.print("Enter Vehicle Name: ");
        String vehicleName = scanner.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Rental Fee: ");
        int rentalFee = scanner.nextInt();
        scanner.nextLine();

        RentalItems06 item = new RentalItems06(TNKBNumber, vehicleName, vehicleType, year, rentalFee);
        rentalItemsList[rentalItemsCount++] = item;
        System.out.println("Rental item added successfully!");
    }

    // add rental transaction
    private static void recordRentalTransaction() {
        System.out.print("Enter Borrower Name: ");
        String borrowerName = scanner.nextLine();
        System.out.print("Enter Length of Loan (in days): ");
        int lengthOfLoan = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Available Rental Items:");
        for (int i = 0; i < rentalItemsCount; i++) {
            System.out.println((i + 1) + ". " + rentalItemsList[i].display());
        }
        System.out.print("Select Rental Item (number): ");
        int itemIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (itemIndex < 0 || itemIndex >= rentalItemsCount) {
            System.out.println("Invalid item selection! Transaction not recorded...");
            return;
        }

        RentalItems06 selectedItem = rentalItemsList[itemIndex];
        RentalTransactions06 transaction = new RentalTransactions06(borrowerName, lengthOfLoan, selectedItem);
        rentalTransactionList[rentalTransactionsCount++] = transaction;
        System.out.println("Rental transaction recorded successfully!");
    }

    // display rental items
    private static void displayRentalItems() {
        if (rentalItemsCount == 0) {
            System.out.println("No rental items available!");
        } else {
            System.out.println("Rental Items:");
            for (int i = 0; i < rentalItemsCount; i++) {
                System.out.println(rentalItemsList[i].display());
            }
        }
    }

    // display rental transactions
    private static void displayRentalTransactions() {
        if (rentalTransactionsCount == 0) {
            System.out.println("No rental transactions recorded!");
        } else {
            System.out.println("Rental Transactions:");
            for (int i = 0; i < rentalTransactionsCount; i++) {
                System.out.println(rentalTransactionList[i].display());
            }
        }
    }

    // sort transactions by TNKB
    private static void sortTransactionsByTNKB() {
        if (rentalTransactionsCount == 0) {
            System.out.println("No rental transactions to sort!");
            return;
        }

        for (int i = 0; i < rentalTransactionsCount - 1; i++) {
            for (int j = i + 1; j < rentalTransactionsCount; j++) {
                // compareTo untuk membandingkan dua TKNB dari items dan transactions
                // compares two objects to determine their order
                if (rentalTransactionList[i].rentalItem.TNKBNumber.compareTo(rentalTransactionList[j].rentalItem.TNKBNumber) > 0) { 
                    // compareTo akan return
                    RentalTransactions06 temp = rentalTransactionList[i];
                    rentalTransactionList[i] = rentalTransactionList[j];
                    rentalTransactionList[j] = temp;
                }
            }
        }

        System.out.println("Transactions sorted by TNKB number!");
    }
}
