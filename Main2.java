class Inventory {

    private final int id;
    private String name;
    private double price;
    private int stock;

    Inventory(int productId, String name, double price, int stock) {

        this.id = productId;

        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "Unknown";
        }

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
            this.price = 0;
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock");
            this.stock = 0;
        }
    }

    public int getProductId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Insufficient stock or invalid quantity");
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100.0);
        } else {
            System.out.println("Invalid discount");
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Inventory inv1 = new Inventory(1, "mouse", 500, 5);

        inv1.displayDetails();

        inv1.addStock(5);

        inv1.sell(3);

        inv1.sell(20);

        inv1.applyDiscount(10);

        inv1.setPrice(-100);

        inv1.setName("");

        inv1.applyDiscount(150);

        inv1.displayDetails();
    }
}