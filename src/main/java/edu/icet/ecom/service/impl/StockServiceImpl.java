package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.entity.FoodItemEntity;
import edu.icet.ecom.repository.StockRepository;
import edu.icet.ecom.service.StockService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StockServiceImpl  implements StockService {

    final ModelMapper mapper;
   final StockRepository stockRepository;
    @Override
    public FoodItem addItem(FoodItem foodItem) {
        return mapper.map(stockRepository.save(mapper.map(foodItem,FoodItemEntity.class)),FoodItem.class);

    }


    @Override
    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> foodItemList = stockRepository.findAll().stream()
                .map(entity ->mapper.map(entity,FoodItem.class))
                .collect(Collectors.toList());

            return  foodItemList;

    }

    @Override
    public FoodItem updateItem(FoodItem foodItem) {
        return mapper.map(stockRepository.save(mapper.map(foodItem,FoodItemEntity.class)),FoodItem.class);

    }

    @Override
    public void removeFood(Integer id) {
        stockRepository.deleteById(id);
    }

    @Override
    public long countFoodItems() {
        return stockRepository.count();
    }
}
