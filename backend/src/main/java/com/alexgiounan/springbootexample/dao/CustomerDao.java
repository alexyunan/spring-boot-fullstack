package com.alexgiounan.springbootexample.dao;

import com.alexgiounan.springbootexample.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();

    Optional<Customer> selectCustomerById(Integer id);

    void insertCustomer(Customer customer);

    boolean existsCustomerWithEmail(String email);

    void deleteCustomerById(Integer id);

    boolean existsPersonWithId(Integer customerId);

    void updateCustomer(Customer update);

    Optional<Customer> selectUserByEmail(String email);

}
