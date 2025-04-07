package edu.icet.ecom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.icet.ecom.dto.OrderDetail;
import jakarta.persistence.*;
import lombok.*;

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

    private Integer contactNumber;

    private Double totalAmount;

    private Double receivedAmount;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrderDetailEntity> orderDetails;


}
