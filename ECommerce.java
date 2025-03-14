// Kelas induk
class ECommerce {
    protected String productName;
    protected double price;
    
    public ECommerce(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public void displayProductInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

