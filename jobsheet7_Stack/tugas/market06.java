package tugas;

public class market06 {
    public static void main(String[] args) {
        receiptStack06 receiptStack = new receiptStack06(8);

        // Adding receipts to the stack
        receiptStack.push(new receipt06("1", "2024-01-05", 3, 150.0));
        receiptStack.push(new receipt06("2", "2024-01-12", 2, 90.0));
        receiptStack.push(new receipt06("3", "2024-01-19", 1, 30.0));
        receiptStack.push(new receipt06("4", "2024-01-26", 4, 220.0));
        receiptStack.push(new receipt06("5", "2024-02-02", 2, 100.0));
        receiptStack.push(new receipt06("6", "2024-02-09", 3, 150.0));
        receiptStack.push(new receipt06("7", "2024-02-16", 1, 50.0));
        receiptStack.push(new receipt06("8", "2024-02-23", 2, 90.0));

        // Retrieve and display 5 receipts for exchanging vouchers
        System.out.println("Receipts for exchanging vouchers:");
        for (int i = 0; i < 5; i++) {
            receipt06 receipt = receiptStack.pop();
            if (receipt != null) {
                System.out.println("Transaction ID: " + receipt.transactionID);
                System.out.println("Date: " + receipt.date);
                System.out.println("Quantity of items: " + receipt.quantityOfItems);
                System.out.println("Total price: " + receipt.totalPrice);
                System.out.println();
            }
        }
    }
}
