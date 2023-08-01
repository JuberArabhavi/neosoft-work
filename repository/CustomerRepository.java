package com.java.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.src.dto.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
