package br.com.javasbnotifications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @RequestMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @GetMapping("/notifications")
    public String notifications() {
        return "Customers are being notified!";
    }

    @RequestMapping("/notifications/orders")
    public String orders() {
        return "Customers are being notified!";
    }

    @PostMapping("/notifications/orders/abandoned-cart")
    public String abandonedCart() {
        return "Customers are being notified!";
    }
}
