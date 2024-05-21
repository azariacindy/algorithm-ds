package midExam;
import java.util.Scanner;

public class transactionMain06 {
    public static void main(String[] args) {
        // Input data
        Scanner scanner = new Scanner(System.in);
        rekening06[] accounts = new rekening06[4];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Enter account details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            String noRek = scanner.nextLine();
            System.out.print("Name: ");
            String nama = scanner.nextLine();
            System.out.print("Mother's Name: ");
            String namaIbu = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            accounts[i] = new rekening06(noRek, nama, namaIbu, phone, email);
            
            // Input transaction details
            System.out.println("Enter transaction details for account " + (i + 1) + ":");
            System.out.print("Initial Balance: ");
            double saldoAwal = scanner.nextDouble();
            System.out.print("Final Balance: ");
            double saldoAkhir = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            System.out.print("Transaction Date: ");
            String tanggalTransaksi = scanner.nextLine();
            System.out.print("Transaction Type: ");
            String type = scanner.nextLine();
            accounts[i].addTransaction(saldoAwal, saldoAkhir, tanggalTransaksi, type);
        }

        // Display data for all accounts
        System.out.println("\nAccount Details:");
        for (rekening06 account : accounts) {
            System.out.println("----------------------------------");
            System.out.println("Account Number: " + account.getNoRek());
            System.out.println("Name: " + account.getNama());
            System.out.println("Mother's Name: " + account.getNamaIbu());
            System.out.println("Phone: " + account.getPhone());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Transaction Details:");
            account.displayTransactions();
            System.out.println("Final Balance: " + account.getSaldoAkhir());
        }

        // Sorting data based on account name
        sortAccountsByName(accounts);

        // Search for data based on account number
        System.out.println("----------------------------------");
        System.out.print("Enter account number to search: ");
        String searchAccountNumber = scanner.next();
        rekening06 foundAccount = searchAccountByNumber(accounts, searchAccountNumber);
        if (foundAccount != null) {
            System.out.println("----------------------------------");
            System.out.println("Account Found:");
            System.out.println("----------------------------------");
            System.out.println("Account Number: " + foundAccount.getNoRek());
            System.out.println("Name: " + foundAccount.getNama());
            System.out.println("Mother's Name: " + foundAccount.getNamaIbu());
            System.out.println("Phone: " + foundAccount.getPhone());
            System.out.println("Email: " + foundAccount.getEmail());
            System.out.println("Saldo: " + foundAccount.getSaldoAkhir());
            System.out.println("----------------------------------");
        } else {
            System.out.println("\nAccount not found.");
            System.out.println("----------------------------------");
        }

        scanner.close();
    }

    // Method to sort accounts by name
    private static void sortAccountsByName(rekening06[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].getNama().compareTo(accounts[j].getNama()) > 0) {
                    // Swap accounts
                    rekening06 temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
    }

    // Method to search for account by number
    private static rekening06 searchAccountByNumber(rekening06[] accounts, String searchNumber) {
        for (rekening06 acc : accounts) {
            if (acc.getNoRek().equals(searchNumber)) {
                return acc;
            }
        }
        return null;
    }    
}
