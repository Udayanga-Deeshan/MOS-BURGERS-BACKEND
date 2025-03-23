package edu.icet.ecom.controller;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
public class StockController {

   final StockService  stockService;

    @PostMapping("/add")
    public  boolean addFoodItem(@RequestBody FoodItem foodItem){
      return  stockService.addItem(foodItem);
    }

    @GetMapping("/get-All")
    public List<FoodItem>getAllFoodItems(){
        return stockService.getAllFoodItems();
    }

    @PutMapping("/update")
    public boolean updateFoodItem(@RequestBody FoodItem foodItem){
        return  stockService.updateItem(foodItem);
    }
}
