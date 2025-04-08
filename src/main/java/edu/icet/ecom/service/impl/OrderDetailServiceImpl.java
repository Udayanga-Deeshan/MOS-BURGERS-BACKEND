package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.OrderDetail;
import edu.icet.ecom.service.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public boolean addOrderDetails(List<OrderDetail> orderDetailList) {
        return false;
    }

    @Override
    public boolean addOrderDetails(OrderDetail orderDetail) {
        return false;
    }
}
