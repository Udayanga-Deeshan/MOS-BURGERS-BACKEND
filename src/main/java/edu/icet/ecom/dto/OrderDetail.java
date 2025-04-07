package edu.icet.ecom.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail {

    private  Integer orderDetailId;


    private FoodItem foodItem;

    private Integer qty;

    private Double total;

}
