class Electronics extends ECommerce {
    private int warrantyPeriod;
    
    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public void displayElectronicsInfo() {
        displayProductInfo();
        System.out.println("Warranty: " + warrantyPeriod + " years");
    }
}
