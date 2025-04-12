package edu.icet.ecom.entity;

import edu.icet.ecom.util.FoodCategory;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private FoodCategory category;

    private String description;

    private Double price;

    private String imageURL;






}
