package entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private String createdDate;
    private String customerId;
    private String customerName;
    private String customerAddress;
    private List<ProductOrder> products = new ArrayList<>();

    public Order() {
    }

    public Order(String id, String createdDate, String customerId, String customerName, String customerAddress) {
        this.id = id;
        this.createdDate = createdDate;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<ProductOrder> getProducts() {
        return products;
    }

    public void setProducts(List<ProductOrder> products) {
        this.products = products;
    }
}