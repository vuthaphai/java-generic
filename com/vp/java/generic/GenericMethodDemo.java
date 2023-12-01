package com.vp.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {
    public static  <T> boolean isEqual(GenericClassTypeDemo<T> t1, GenericClassTypeDemo<T> t2){
        return t1.getValue().equals(t2.getValue());
    }

    public static <T>List<T> combine(List<T> list1, List<T> list2){
        List<T> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {
//        GenericClassTypeDemo<Integer> t1 = new GenericClassTypeDemo<>();
//        t1.setValue(5);
//
//        GenericClassTypeDemo<Integer> t2 = new GenericClassTypeDemo<>();
//        t2.setValue(7);
//
//        boolean test = GenericMethodDemo.isEqual(t1,t2);
//        System.out.println(test);

        List<String> list1 = new ArrayList<String>();
        list1.add("Test01");
        list1.add("Test02");
        list1.add("Test03");

        List<String> list2 = new ArrayList<String>();
        list1.add("Test04");
        list1.add("Test05");
        list1.add("Test06");

        List<String> result = combine(list1,list2);

        System.out.println(result);



    }
}
