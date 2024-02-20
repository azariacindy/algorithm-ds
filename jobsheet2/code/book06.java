public class book06 {

    String title, author;
    int page, stock, price;

    void showInformation() {
        System.out.println("============================");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + page);
        System.out.println("Stock: " + stock);
        System.out.printf("Price: Rp.%d%n", price);
        System.out.println("============================");
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

    public book06() {

    }

    public book06(String tit, String aut, int pg, int stk, int pric) {
        title = tit;
        author = aut;
        page = pg;
        stock = stk;
        price = pric;
    }
}
