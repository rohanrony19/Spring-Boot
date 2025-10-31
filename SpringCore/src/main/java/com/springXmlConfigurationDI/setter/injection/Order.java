package com.springXmlConfigurationDI.setter.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order {
    private int orderId;
    private List<String> productList;
    private Set<Integer> price;
    private Map<String,Double> productAndPrice;

    public Order() {
        System.out.println("Bean/Object is created by Spring Container");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        System.out.println("Order id setId: " + orderId);
        this.orderId = orderId;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        System.out.println("Ordered Product: " + productList);
        this.productList = productList;
    }

    public Set<Integer> getPrice() {
        return price;
    }

    public void setPrice(Set<Integer> price) {
        System.out.println("Price setter is called: " + price);
        this.price = price;
    }

    public Map<String, Double> getProductAndPrice() {
        return productAndPrice;
    }

    public void setProductAndPrice(Map<String, Double> productAndPrice) {
        this.productAndPrice = productAndPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productList=" + productList +
                ", price=" + price +
                ", productAndPrice=" + productAndPrice +
                '}';
    }
}
