package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final OrderRepository orderRepository;
    final ModelMapper mapper;
    @Override
    public void placeOrder(Order order) {

        //orderRepository.save(mapper.map(order, OrderEntity.class));
    }
}
