package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.dto.OrderDetail;
import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.OrderDetailService;
import edu.icet.ecom.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final OrderRepository orderRepository;
    final OrderDetailService orderDetailService;
    final ModelMapper mapper;
    @Transactional
    @Override
    public void placeOrder(Order order) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCustomerName(order.getCustomerName());
        orderEntity.setOrderDate(LocalDateTime.now());
        orderEntity.setTotalAmount(order.getTotalAmount());
        orderEntity.setReceivedAmount(order.getReceivedAmount());

        OrderEntity savedOrder = orderRepository.save(orderEntity);
        System.out.println("Saved Order: " + savedOrder);


        for (OrderDetail detail : order.getOrderDetails()) {
            detail.setOrderId(savedOrder.getId());
        }

        List<OrderDetail> orderDetails = order.getOrderDetails();
        for (OrderDetail orderDetail : orderDetails) {

            boolean savedSuccessfully = orderDetailService.addOrderDetails(orderDetail);
            if (!savedSuccessfully) {
                throw new RuntimeException("Failed to save order detail for order: " + savedOrder.getId());
            }
        }

        System.out.println("Order details saved successfully for Order: " + savedOrder.getId());
    }

    @Override
    public Long countOrders() {
        return orderRepository.count();
    }

    @Override
    public List<Order> allOrders() {
        return orderRepository.findAll().stream()
                .map(orderEntity -> mapper.map(orderEntity,Order.class))
                .collect(Collectors.toList());
    }

}
