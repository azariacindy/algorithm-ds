package tugas;

public class receipt06 {
    String transactionID, date;
    int quantityOfItems;
    double totalPrice;

    public receipt06(String id, String date, int quantity, double total) {
        this.transactionID = id;
        this.date = date;
        this.quantityOfItems = quantity;
        this.totalPrice = total;
    }
}
