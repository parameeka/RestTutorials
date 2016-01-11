package com.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.rest.entity.Customer;

@Repository
@RestResource(path = "customer", rel="customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {


}
