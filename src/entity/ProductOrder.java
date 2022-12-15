package entity;

public class ProductOrder extends Product {
    private int quantity;

    public ProductOrder(Product product, int quantity) {
        super(product);
        this.quantity = quantity;
    }
}
