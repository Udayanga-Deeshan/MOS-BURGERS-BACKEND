package edu.icet.ecom.service;

import edu.icet.ecom.dto.FoodItem;

import java.util.List;

public interface StockService {

    FoodItem addItem(FoodItem foodItem);

    List<FoodItem> getAllFoodItems();

    FoodItem updateItem(FoodItem foodItem);

    void removeFood(Integer id);

    long countFoodItems();
}
