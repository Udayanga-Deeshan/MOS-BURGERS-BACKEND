package edu.icet.ecom.dto;

import edu.icet.ecom.util.FoodCategory;
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

    private FoodCategory category;

    private Double price;


    private Double itemDiscount;

    private String imageURl;

    private  boolean isExpired;

    private  boolean isRemoved;
}
