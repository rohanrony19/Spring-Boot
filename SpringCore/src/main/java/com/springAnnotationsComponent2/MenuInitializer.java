package com.springAnnotationsComponent2;

import com.SpringAnnotationsComponent1.Order;
import com.SpringAnnotationsComponents.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MenuInitializer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

        Order order = (Order) context.getBean("o1");
        System.out.println(order.getProduct());
        System.out.println("------------------------");

        System.out.println(order.getId());
        Product product = order.getProduct();
        product.setId(1);
        product.setName("condom");
        product.setPrice(35);
        System.out.println(product);
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());


        System.out.println("----------------------");
        product.getMenu().setName("Mart");
        product.getMenu().setTotalItems(100);
        System.out.println(product.getMenu());
        System.out.println(product.getMenu().getName());
        System.out.println(product.getMenu().getTotalItems());

        System.out.println("-------------------------");
//        before running this, remove autowired
//        Order o = (Order) context.getBean("getOrder");
//        System.out.println("Id No: "+o.getId());
//        System.out.println("Brand Id: " + o.getProduct().getId());
//        System.out.println("Product Name: "+o.getProduct().getName());
//        System.out.println("Price: "+o.getProduct().getPrice());
//        String name = o.getProduct().getMenu().getName();
//        System.out.println("Name of the Mart: " + name);
//        double totalItems = o.getProduct().getMenu().getTotalItems();
//        System.out.println("Total Items: " + totalItems);
    }
}
