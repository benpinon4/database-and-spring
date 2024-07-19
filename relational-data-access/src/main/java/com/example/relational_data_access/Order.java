package com.example.relationaldataaccess;

public class Order {
//   private long id;
  private String order_total;

  public Order(long id, String order_total) {
  
    this.order_total = order_total;
  }

  @Override
  public String toString() {
    return String.format(
        "order_total='%s']",
       order_total);
  }

  // getters & setters omitted for brevity
}