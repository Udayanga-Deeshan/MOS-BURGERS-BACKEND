package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    final OrderService orderService;


    @PostMapping("/place-order")
    public void placeOrder(@RequestBody Order order){
        orderService.placeOrder(order);
    }

    @GetMapping("/all")
    public List<Order> allOrders(){
        return  orderService.allOrders();
    }

}
