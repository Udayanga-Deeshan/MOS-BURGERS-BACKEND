package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.service.StockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl  implements StockService {
    @Override
    public boolean addItem(FoodItem foodItem) {
        return false;
    }

    @Override
    public List<FoodItem> getAllFoodItems() {
        return List.of();
    }

    @Override
    public boolean updateItem(FoodItem foodItem) {
        return false;
    }
}
