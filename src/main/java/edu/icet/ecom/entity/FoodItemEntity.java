package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "foodItem")
public class FoodItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    private String itemName;

    private String category;

    private Double price;

    private  Integer stock;

    private Double itemDiscount;

    private String imageURl;

    @Column(name = "is_expired",columnDefinition = "TINYINT(1)",nullable = false)
    private  boolean isExpired =false;

    @Column(name = "is_removed", columnDefinition = "TINYINT(1)", nullable = false)
    private  boolean isRemoved =false;

    public  void  softDelete(){
        this.isRemoved=true;
    }
}
