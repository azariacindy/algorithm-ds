public class book06 {

    String title, author;
    int page, stock, price;

    void showInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + page);
        System.out.println("Stock: " + stock);
        System.out.printf("Price: Rp.%d%n", price);
    }

    void sold(int amount) {
        if (stock > 0) {
            stock -= amount;
        } else {
            System.out.println("Sorry, the book is out of stock!");
        }
    }    

    void restock(int amount) {
        stock += amount;
        System.out.println("Restocked successfully.");
    }

    void priceChange(int prc) {
        price = prc;
        System.out.println("Price changed successfully.");
    }
}
