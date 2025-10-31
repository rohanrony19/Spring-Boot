package com.springXmlConfigurationDI.constructor.injection;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
@Getter
@Setter
public class CartItems {
    private String name;
    private List<String> itemNames;
    private Map<String ,Double> itemAndPrice;
    private Product product;

    //Constructor is mandatory
    public  CartItems(){
        System.out.println("CartItems with no argument");
    }
    public CartItems(String name, List<String> itemNames) {
        System.out.println("CartItems with 2 argument");
        this.name = name;
        this.itemNames = itemNames;
    }

    public CartItems(String name) {
        System.out.println("CartItems with 1 argument : String");
        this.name = name;
    }

    public CartItems(List<String> itemNames) {
        System.out.println("CartItems with 1 argument : List");
        this.itemNames = itemNames;
    }

    public CartItems(Map<String, Double> itemAndPrice, List<String> itemNames, String name) {
        System.out.println("CartItems with 3 argument ");
        this.itemAndPrice = itemAndPrice;
        this.itemNames = itemNames;
        this.name = name;
    }

    public CartItems(Map<String, Double> itemAndPrice, List<String> itemNames, String name,Product product) {
        System.out.println("CartItems with 3 argument ");
        this.itemAndPrice = itemAndPrice;
        this.itemNames = itemNames;
        this.name = name;
        this.product = product;
    }

    public CartItems(Map<String, Double> itemAndPrice) {
        System.out.println("CartItems with 1 argument : Map ");
        this.itemAndPrice = itemAndPrice;
    }

    public CartItems(List<String> itemNames, Map<String, Double> itemAndPrice) {
        System.out.println("CartItems with 2 argument : List & Map ");
        this.itemNames = itemNames;
        this.itemAndPrice = itemAndPrice;
    }
}
