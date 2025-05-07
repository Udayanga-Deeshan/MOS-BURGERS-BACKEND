package edu.icet.ecom.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;

    private String customerName;

    private LocalDateTime orderDate;

    private Double totalAmount;

    private Double receivedAmount;

    private List<OrderDetail> orderDetails;


}
