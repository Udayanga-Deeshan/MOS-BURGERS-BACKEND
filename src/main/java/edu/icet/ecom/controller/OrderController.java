package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/order")
public class OrderController {



    @PostMapping("/place-order")
    public void placeOrder(Order order){

    }

}
