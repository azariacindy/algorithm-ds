public class book06 {

    String title, author;
    int page;
    double stock, price;

    void showInformation() {
        System.out.println("============================");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + page);
        System.out.println("Stock: " + stock);
        System.out.printf("Price: Rp.%.2f%n", price); // Corrected format specifier
        System.out.println("============================");
    }

    // Method for calculating stock after sale
    void sold(int amount) {
        if (stock >= amount) { // Ensure stock is not negative after selling
            stock -= amount;
        } else {
            System.out.println("Sorry, the book is out of stock!");
        }
    }

    // method to add stock 
    void restock(int amount) {
        stock += amount;
        System.out.println("Restocked successfully.");
    }

    // method to change the book price
    void priceChange(double prc) {
        price = prc;
        System.out.println("Price changed successfully.");
    }

    // default constructor
    public book06() {

    }

    // constructor with parameters
    public book06(String tit, String aut, int pg, double stk, double pric) {
        title = tit;
        author = aut;
        page = pg;
        stock = stk;
        price = pric;
    }

    // Method to calculate total price
    double calculateTotalPrice(double quantity) {
        return price * quantity;
    }

    // Method to calculate discount
    double calculateDiscount(double totalPrice) {
        if (totalPrice > 150000) {
            return 0.12; // 12% discount
        } else if (totalPrice >= 75000 && totalPrice <= 150000) {
            return 0.05; // 5% discount
        } else {
            return 0; // No discount
        }
    }

    // Method to calculate final price after discount
    double calculateFinalPrice(double quantity) {
        double totalPrice = calculateTotalPrice(quantity);
        double discountRate = calculateDiscount(totalPrice);
        double discountAmount = totalPrice * discountRate;
        return totalPrice - discountAmount;
    }
}
