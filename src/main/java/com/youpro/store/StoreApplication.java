package com.youpro.store;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

     //   SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService(new PaypalPaymentService());
        var orderService1 = new OrderService(new StripePaymentService());
        orderService.placeOrder();
        orderService1.placeOrder();
    }

}
