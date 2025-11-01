package com.springXmlConfigurationDI.setter.injection;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private boolean isExpired;
    private char inStock;

    public Product(){
        System.out.println("Object is created by IOC Container");
    }

    // we need setter methods for setter injection
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        System.out.println("productId setter is called with value : " +productId);
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        System.out.println("productName setter is called with value : " +productName);
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("productPrice setter is called with value : " +price);
        this.price = price;
    }

    public boolean IsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean expired) {
        System.out.println("productExpire setter is called with value : " +expired);
        isExpired = expired;
    }

    public char getInStock() {
        return inStock;
    }

    public void setInStock(char inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", isExpired=" + isExpired +
                ", inStock=" + inStock +
                '}';
    }
}
