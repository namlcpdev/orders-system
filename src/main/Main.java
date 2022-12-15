package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Order;
import entity.Product;
import entity.ProductOrder;
import service.OrderService;
import service.ProductService;
import validate.Validation;

public class Main {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ProductService ps = new ProductService();
    OrderService os = new OrderService();
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();
    do {
      System.out.print("\n------------------------------  MENU  ------------------------------\n"
          + "1. Add a new product to the Store.\n"
          + "2. Update price for a particular product.\n"
          + "3. A list of all available products in the Store.\n"
          + "4. Create a new Order.\n"
          + "5. Print information of an Order by OrderID.\n"
          + "6. Sort all products by product price as ascending.\n"
          + "7. Print information of all Orders by a specific customer ID.\n"
          + "8. Print information of all Orders.\n"
          + "9. Exit.\n"
          + "--------------------------------------------------------------------\n");
      int choice = Validation.inputInt("Select your choice: ", 1, 9);
      switch (choice) {
        case 1:
          Product product = ps.createProduct();
          products.add(product);
          break;
        case 2:
          ps.updatePriceProduct(products);
          break;
        case 3:
          ps.listAllProduct(products);
          break;
        case 4:
          Order order = os.createOrder();
          ps.listAllProduct(products);
          List<ProductOrder> productOrders = new ArrayList<>();
          while (true) {
            Product productById = ps.geProductById(products);
            if (productById != null) {
              int quantity = Validation.inputInt("Select quantity: ", 1, Integer.MAX_VALUE);
              productOrders.add(new ProductOrder(productById, quantity));
              order.setProducts(productOrders);
            } else {
              System.out.println("Product not exists!");
            }
            System.out.print("Add more product: ");
            String addMore = sc.nextLine();
            if (addMore.equalsIgnoreCase("n")) {
              orders.add(order);
              break;
            }
          }
          break;
        case 5:
          break;
      }
    } while (true);
  }
}
