package service;

import java.util.List;

import entity.Product;
import validate.Validation;

public class ProductService {

  public Product createProduct() {
    String id = "P" + Validation.randomId(1, 999);
    System.out.println("Product ID: " + id);
    String name = Validation.inputString("Enter name: ");
    double price = Validation.inputDouble("Enter price: ", 0, Double.MAX_VALUE);
    return new Product(id, name, price);
  }

  public void listAllProduct(List<Product> products) {
    products.forEach(product -> {
      System.out.println(product);
    });
  }

  public void updatePriceProduct(List<Product> products) {
    listAllProduct(products);
    String id = Validation.inputString("Enter product id: ");
    products.forEach(product -> {
      if(product.getId().equals(id)) {
        product.setPrice(Validation.inputDouble("Enter price: ", 0, Double.MAX_VALUE));
      }
    });
  }

  public Product geProductById(List<Product> products) {
    String id = Validation.inputString("Enter product id: ");
    for (Product product : products) {
      if(product.getId().equals(id)) {
        return product;
      }
    }
    return null;
  }
}
