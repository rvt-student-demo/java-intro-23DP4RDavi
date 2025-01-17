package lv.rvt;

public class Product {
    private final String name;
    private final double price;
    private final int count;
    
    public Product(String name, double price, int count) {
        this.name = "banana";
        this.price = 1.1;
        this.count = 100;
    }
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.count + "pcs");
      }
}