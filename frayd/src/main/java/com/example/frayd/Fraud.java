package com.example.frayd;

import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Fraud {

  @Id
  @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
  private Integer id;

  private Integer customerId;
  private Boolean isFraudster;
  private LocalDateTime createdAt;
}
