import java.util.Scanner;

public class productMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int productAmount = sc.nextInt();

        // Membuat array untuk menyimpan objek Product06
        product06[] productArray = new product06[productAmount];

        for (int i = 0; i < productAmount; i++) {
            sc.nextLine(); // Consume the newline character
            System.out.println("\nEnter details for product " + (i + 1));
            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            productArray[i] = new product06(productName, price, quantity);
        }

        // Membuat objek Transaction dan menambahkan produk ke dalamnya
        transaction06 transaction = new transaction06(productAmount);

        for (int i = 0; i < productAmount; i++) {
            transaction.addProduct(productArray[i]);
        }

        // Menampilkan informasi produk dalam transaksi
        System.out.println("\nTransaction details:");
        for (int i = 0; i < productAmount; i++) {
            System.out.println("\nProduct " + (i + 1) + " details:");
            productArray[i].cetakInfo();
        }

        // Menghitung dan menampilkan total harga transaksi
        double totalTransaction = transaction.calculateTotal();
        System.out.println("\nTotal Transaction Amount: Rp." + String.format("%.2f", totalTransaction));

        sc.close();
    }
}
