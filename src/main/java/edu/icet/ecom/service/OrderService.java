package edu.icet.ecom.service;

import edu.icet.ecom.dto.Order;

import java.util.List;

public interface OrderService {
    void placeOrder(Order order);

    Long countOrders();

    List<Order> allOrders();
}
