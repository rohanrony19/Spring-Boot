package com.springAnnotationsComponent2;

import com.SpringAnnotationsComponent1.Order;
import com.SpringAnnotationsComponents.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.SpringAnnotationsComponents",
        "com.SpringAnnotationsComponent1",
        "com.SpringAnnotationsComponent2"
})
public class MenuConfig {

    @Bean
    public Order getOrder(){
        System.out.println("Creating order...");
        return new Order(1,getProduct());
    }

    @Bean
    public Product getProduct(){
        System.out.println("getting product...");
        Product product = new Product();
        product.setId(69);
        product.setName("Absolute");
        product.setPrice(300);
        product.setMenu(getMenu());
        return product;
    }

    @Bean
    public Menu getMenu(){
        System.out.println("Creating Menu");
        return new Menu("Dmart",5);
    }
}
