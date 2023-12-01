package com.vp.pattern.main;

import com.vp.pattern.combinatorpattern.CustomerValidator;
import com.vp.pattern.combinatorpattern.ValidateResult;
import com.vp.pattern.model.Customer;
import com.vp.pattern.model.CustomerService;

import java.time.LocalDate;

public class CustomerApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Vutha", "+855963435365","vuthaphai@gmail.com", LocalDate.of(1986,6,12));
//        CustomerService customerService = new CustomerService();
//        boolean valid = customerService.isValid(customer);
//        System.out.println(valid);

        ValidateResult result = CustomerValidator
                .validatePhone()
                .and(CustomerValidator.validateEmail())
                .and(CustomerValidator.validateAge())
                .apply(customer);
        System.out.println(result);

    }
}
