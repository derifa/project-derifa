// Program utama
public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 1200.99, 2);
        Clothing tshirt = new Clothing("T-Shirt", 19.99, "L");
        Books novel = new Books("The Alchemist", 15.99, "Paulo Coelho", 208);

        laptop.displayElectronicsInfo();
        System.out.println();
        tshirt.displayClothingInfo();
        System.out.println();
        novel.displayBookInfo();
    }
}
