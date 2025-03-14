class Clothing extends ECommerce {
    private String size;
    
    public Clothing(String productName, double price, String size) {
        super(productName, price);
        this.size = size;
    }
    
    public void displayClothingInfo() {
        displayProductInfo();
        System.out.println("Size: " + size);
    }
}