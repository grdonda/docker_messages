package br.com.javasbnotifications.controllers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    @RequestMapping("/ping")
    public String ping() {
        return "Pong!";
    }

    @RequestMapping("/customers/notifications/orders/abandoned-cart")
    public String status() {
        return "buscar na base de dados todos os clientes que possuam carrinho com status XPTO com mais de 1h do datetime atual";
    }

    @PostMapping("/status")
    public String status(@RequestBody String message) {
        return message;
    }
}
