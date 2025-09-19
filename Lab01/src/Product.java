public class Product {

    String name;
    int ID;
    double price;
    boolean inStock;

    
    Product() {
        name = "Unknown";
        ID = 0;
        price = 0.0;
        inStock = false;
    }

    
    Product(String n, int id, double PRICE, boolean instock) {
        name = n;
        ID = id;
        price = PRICE;
        inStock = instock;
    }

   
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public boolean getStock() {   
        return inStock;
    }

    
    public void setInStock(boolean instock) {
        inStock = instock;
    }

    
    public void display() {
        System.out.println("Product Details:");
        System.out.println("Name       : " + name);
        System.out.println("ID         : " + ID);
        System.out.println("Price      : $" + price);
        System.out.println("In Stock   : " + (inStock ? "Yes" : "No"));
    }
}
