package com.example.customer;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerRequest {
  Integer id;
  String name;
  String surname;
  String email;

}
