package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodItem {

    private Integer itemId;

    private String itemName;

    private String category;

    private Double price;

    private  Integer stock;

    private Double itemDiscount;

    private String imageURl;

    private  boolean isExpired;

    private  boolean isRemoved;
}
