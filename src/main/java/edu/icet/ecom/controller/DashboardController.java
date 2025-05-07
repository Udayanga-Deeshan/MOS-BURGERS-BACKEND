package edu.icet.ecom.controller;

import edu.icet.ecom.service.CustomerService;
import edu.icet.ecom.service.OrderService;
import edu.icet.ecom.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
@CrossOrigin
public class DashboardController {

    final CustomerService customerService;
    final StockService stockService;
    final OrderService orderService;

    @GetMapping("/counts")
    public ResponseEntity<Map<String,Long>>getCounts(){
        HashMap<String, Long> counts = new HashMap<>();
        counts.put("customers",customerService.countCustomers());
        counts.put("products",stockService.countFoodItems());
        counts.put("orders",orderService.countOrders());

        return  ResponseEntity.ok(counts);

    }
}
