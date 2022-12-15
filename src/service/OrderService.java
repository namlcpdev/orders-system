package service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entity.Order;
import validate.Validation;

public class OrderService {

  public Order createOrder() {
    DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    String createDate = dtf.format(now);
    String orderId = "O" + Validation.randomId(1, 999);
    String customerId = "O" + Validation.randomId(1, 999);
    System.out.println("Order date: " + createDate);
    System.out.println("Order ID: " + orderId);
    System.out.println("Customer ID: " + customerId);
    String customerName = Validation.inputString("Enter customer name: ");
    String customerAddress = Validation.inputString("Enter customer address: ");
    return new Order(orderId, createDate, customerId, customerName, customerAddress);
  }
}
