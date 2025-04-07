package edu.icet.ecom.service;

import edu.icet.ecom.dto.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    boolean addOrderDetails(List<OrderDetail> orderDetailList);
    boolean addOrderDetails(OrderDetail orderDetail);
}
