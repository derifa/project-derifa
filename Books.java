class Books extends ECommerce {
    private final String author;
    private final int pages;
    
    public Books(String productName, double price, String author, int pages) {
        super(productName, price);
        this.author = author;
        this.pages = pages;
    }
    
    public void displayBookInfo() {
        displayProductInfo();
        System.out.println("Author: " + author + ", Pages: " + pages);
    }
}
