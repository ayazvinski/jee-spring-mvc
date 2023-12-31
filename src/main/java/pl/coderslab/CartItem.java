package pl.coderslab;

public class CartItem {
    private int quantity;
    private Product product;

    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public double itemAmount() {
        return quantity * product.getPrice();
    }
    @Override
    public String toString() {
        return "CartItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
