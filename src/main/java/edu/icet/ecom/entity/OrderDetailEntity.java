package edu.icet.ecom.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "order_details")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer orderDetailId;

    @ManyToOne
    @JoinColumn(name = "orderId",referencedColumnName = "id", nullable = false)
    private  OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "productId",referencedColumnName = "itemId", nullable = false)
    private FoodItemEntity foodItem;

    private Integer qty;

    private Double total;

}
