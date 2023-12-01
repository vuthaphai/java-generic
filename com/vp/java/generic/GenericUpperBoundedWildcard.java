package com.vp.java.generic;

import java.util.List;

public class GenericUpperBoundedWildcard {
    public static void main(String[] args) {
        List<Long> numbers  = List.of(1L,2L,3L,4L);
        double total = sum(numbers);
        System.out.println(total);

    }

    public static  double sum(List<? extends Number> numbers) {
        double total =0;
        for(Number num: numbers){
            total += num.doubleValue();
        }
        return total;
    }

}
