package com.padillatomas.customer.service;

import com.padillatomas.customer.model.entity.Customer;
import com.padillatomas.customer.model.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        //todo: Check validation email, already in DB, persist.

        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

    }
}
