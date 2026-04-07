package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public void saveCustomer(Customer customer) {
        repo.save(customer);
    }
}