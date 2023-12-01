package com.vp.pattern.combinatorpattern;

import com.vp.pattern.model.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerValidator extends Function<Customer, ValidateResult> {
    public static CustomerValidator validatePhone(){
        return customer -> customer.getPhone().startsWith("+855")? ValidateResult.SUCCESS: ValidateResult.ERROR_PHONE;
    }

    public static CustomerValidator validateEmail(){
        return customer -> customer.getEmail().contains("@")? ValidateResult.SUCCESS: ValidateResult.ERROR_EMAIL;
    }
    public static CustomerValidator validateAge(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>18 ? ValidateResult.SUCCESS: ValidateResult.ERROR_AGE;
    }

    public default CustomerValidator and(CustomerValidator other){
        return customer -> {
            ValidateResult result = this.apply(customer);
            return result == ValidateResult.SUCCESS? other.apply(customer): result;
        };
    }


}
