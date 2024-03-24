package br.com.javasbnotifications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumers")
public class ConsumersController {

    @RequestMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @RequestMapping("/notifications")
    public String notifications() {
        return "Consumers are being notified!";
    }

    @RequestMapping("/notifications/offers")
    public String offers() {
        return "Consumers are being notified!";
    }

    @RequestMapping("/notifications/orders/abandoned-cart")
    public String abandonedCart() {
        return "Consumers are being notified!";
    }
}
