class transaction06 {
    product06[] products;
    int productCount;

    public transaction06(int maxSize) {
        products = new product06[maxSize];
        productCount = 0;
    }

    public void addProduct(product06 product) {
        products[productCount++] = product;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += products[i].price * products[i].quantity;
        }
        return total;
    }
}
