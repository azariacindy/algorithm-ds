public class bookMain06 {
    public static void main(String[] args) {
        // Objects for the first book
        book06 bk1 = new book06();
        // filling object bk1
        bk1.title = "Today Ends Tomorrow Comes";
        bk1.author = "Denanda Pratiwi";
        bk1.page = 198;
        bk1.stock = 13;
        bk1.price = 71000;

        // Accessing method
        // Display the first book information
        bk1.showInformation();

        // Tried to sell 5 books and changed the price
        bk1.sold(5);
        bk1.priceChange(60000);

        // Display first book information after sale and price change
        bk1.showInformation();

        // Objects for the second book
        book06 bk2 = new book06("Self Reward", "Mahera Ayesha", 160, 29, 59000);

        // Display the second book information
        bk2.showInformation();

        // Trying to sell 11 books second book
        bk2.sold(11);

        // Display the second book information after the sale
        bk2.showInformation();

        // Display the total price, discount, and paid price for the first book
        int quantityBk1 = 3; // Replace with the number of books you want to calculate
        double totalBk1 = bk1.calculateTotalPrice(quantityBk1);
        double discountBk1 = bk1.calculateDiscount(totalBk1);
        double finalPriceBk1 = bk1.calculateFinalPrice(quantityBk1);

        System.out.println("Total Price (Bk1): Rp." + totalBk1);
        System.out.println("Discount (Bk1): " + (discountBk1 * 100) + "%");
        System.out.println("Final Price (Bk1): Rp." + finalPriceBk1);

        // Display the total price, discount, and paid price for the second book
        int quantityBk2 = 2; // Replace with the number of books you want to calculate
        double totalBk2 = bk2.calculateTotalPrice(quantityBk2);
        double discountBk2 = bk2.calculateDiscount(totalBk2);
        double finalPriceBk2 = bk2.calculateFinalPrice(quantityBk2);

        System.out.println("Total Price (Bk2): Rp." + totalBk2);
        System.out.println("Discount (Bk2): " + (discountBk2 * 100) + "%");
        System.out.println("Final Price (Bk2): Rp." + finalPriceBk2);
    }
}
