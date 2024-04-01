public class product06 {
    public String productName;
    public double price;
    public int quantity;

    public product06(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void cetakInfo() {
        System.out.println("Name of product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
