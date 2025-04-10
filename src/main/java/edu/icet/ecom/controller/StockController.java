package edu.icet.ecom.controller;

import edu.icet.ecom.dto.FoodItem;
import edu.icet.ecom.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
@CrossOrigin
public class StockController {


    final StockService  stockService;



    @PostMapping("/add")
    public  FoodItem addFoodItem(@RequestBody FoodItem foodItem){
        System.out.println(foodItem);
      return  stockService.addItem(foodItem);

    }

    @GetMapping("/All")
    public List<FoodItem>getAllFoodItems(){
        return stockService.getAllFoodItems();
    }

    @PutMapping("/update")
    public FoodItem updateFoodItem(@RequestBody FoodItem foodItem){
        return  stockService.updateItem(foodItem);
    }

    @DeleteMapping("/remove-product/{id}")
    public  void removeFood(@PathVariable Integer id){
        stockService.removeFood(id);
    }


}
