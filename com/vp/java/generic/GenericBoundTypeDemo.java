package com.vp.java.generic;

import java.util.List;

public class GenericBoundTypeDemo {
    public static void main(String[] args) {
        List<Integer> numbers  = List.of(1,2,3,4);
        double total = sum(numbers);
        System.out.println(total);
    }
    public static <T extends Number> double sum(List<T> numbers) {
        double total =0;
        for(T num: numbers){
            total += num.doubleValue();
        }
        return total;
    }
}
