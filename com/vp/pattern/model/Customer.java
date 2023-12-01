package com.vp.pattern.model;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String phone;
    private String email;
    private LocalDate dob;

    public Customer(String name, String phone, String email, LocalDate dob) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
