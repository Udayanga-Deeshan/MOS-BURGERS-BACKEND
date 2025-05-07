package edu.icet.ecom.service;

import edu.icet.ecom.dto.Order;

public interface OrderService {
    void placeOrder(Order order);

    Long countOrders();
}
