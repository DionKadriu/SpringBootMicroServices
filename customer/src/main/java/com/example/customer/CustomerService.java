package com.example.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerRepository repository;

  public void registerCustomer(CustomerRequest request) {
    Customer customer = Customer.builder()
        .id(request.getId())
        .email(request.getEmail())
        .name(request.getName())
        .surname(request.getSurname())
        .build();
    repository.save(customer);
  }
}
