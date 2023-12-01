package com.vp.pattern.model;

import java.time.LocalDate;
import java.time.Period;

public class CustomerService {

    public boolean isValid(Customer customer){
        return isValidPhone(customer.getPhone()) & isValidEmail(customer.getEmail()) && isValidAge(customer.getDob());
    }

    private boolean isValidPhone(String phone){
        return phone.startsWith("+855");
    }

    private boolean isValidEmail(String email){
        return email.contains("@");
    }

    private boolean isValidAge(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() >18;
    }

}
