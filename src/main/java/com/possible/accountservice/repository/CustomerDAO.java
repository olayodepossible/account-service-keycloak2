package com.possible.accountservice.repository;

import com.possible.accountservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
