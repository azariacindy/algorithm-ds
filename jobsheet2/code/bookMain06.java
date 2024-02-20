public class bookMain06 {
    public static void main(String[] args) {
        book06 bk1 = new book06();
        bk1.title = "Today Ends Tomorrow Comes";
        bk1.author = "Denanda Pratiwi";
        bk1.page = 198;
        bk1.stock = 13;
        bk1.price = 71000;

        bk1.showInformation();
        bk1.sold(5);
        bk1.priceChange(60000);
        bk1.showInformation();
    }
}
