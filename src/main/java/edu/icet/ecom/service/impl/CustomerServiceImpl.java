package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

   private final CustomerRepository customerRepository;

   private final ModelMapper modelMapper;

    @Override
    public void addCustomer(Customer customer) {

        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(modelMapper.map(customer,CustomerEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        List<CustomerEntity> all = customerRepository.findAll();
        List<Customer> customerList = new ArrayList<>();
        for(CustomerEntity customer:all){
            customerList.add(modelMapper.map(customer,Customer.class));
        }

        return  customerList;
    }

    @Override
    public boolean deletecustomer(Integer customerId) {
        customerRepository.findById(customerId).ifPresent(customerEntity -> {
            customerEntity.softDelete();
            customerRepository.save(customerEntity);
        });
        return  true;
    }

    @Override
    public long countCustomers() {
        return 0;
    }
}
