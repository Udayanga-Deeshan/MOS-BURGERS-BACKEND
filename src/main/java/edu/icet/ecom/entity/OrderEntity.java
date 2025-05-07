package edu.icet.ecom.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    private Double totalAmount;

    private Double receivedAmount;

    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderDetails;


}
