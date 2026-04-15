package advanced.eight;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    public static int totalCartsCreated = 0;
    public Cart(){
        products = new ArrayList<>();
        totalCartsCreated++;

    }
    public static int getTotalCartsCreated() {
        return totalCartsCreated;
    }
    public void addToCart(Product product){
        products.add(product);
    }
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void applyDiscount(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }

        double factor = 1 - (percentage / 100);
        for (Product product : products) {
            product.setPrice(product.getPrice() * factor);
        }
    }

}
