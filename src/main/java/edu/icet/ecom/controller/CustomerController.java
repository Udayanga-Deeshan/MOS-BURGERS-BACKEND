package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

   final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @PutMapping("/update")
    public void  updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @GetMapping("get-all")
    List<Customer> allcustomer(){
        return  service.getAll();
    }

    @DeleteMapping("/delete/{customerId}")
    public  boolean deleteCustomer(@PathVariable Integer customerId){
            return  service.deletecustomer(customerId);

    }
}
