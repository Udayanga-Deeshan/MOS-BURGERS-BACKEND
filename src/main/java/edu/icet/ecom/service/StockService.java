package edu.icet.ecom.service;

import edu.icet.ecom.dto.FoodItem;

import java.util.List;

public interface StockService {

    boolean addItem(FoodItem foodItem);

    List<FoodItem> getAllFoodItems();

    boolean updateItem(FoodItem foodItem);
}
