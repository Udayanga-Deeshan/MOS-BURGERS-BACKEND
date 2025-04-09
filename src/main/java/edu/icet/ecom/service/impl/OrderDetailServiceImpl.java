package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.OrderDetail;
import edu.icet.ecom.entity.OrderDetailEntity;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderDetailRepository;
import edu.icet.ecom.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {

    final ModelMapper mapper;
    final OrderDetailRepository orderDetailRepository;
    @Override
    public boolean addOrderDetails(List<OrderDetail> orderDetailList) {
        for(OrderDetail orderDetail:orderDetailList){
            boolean isAddOrderDetail = addOrderDetails(orderDetail);
            if(!isAddOrderDetail){
                return  false;
            }

        }
        return true;
    }

    @Override
    public boolean addOrderDetails(OrderDetail orderDetail) {
        OrderDetailEntity orderDetailEntity = mapper.map(orderDetail, OrderDetailEntity.class);


        OrderEntity order = new OrderEntity();
        order.setId(orderDetail.getOrderId());
        orderDetailEntity.setOrder(order);


        orderDetailRepository.save(orderDetailEntity);
        System.out.println("Saved OrderDetail: " + orderDetailEntity);
        return true;
    }
}
