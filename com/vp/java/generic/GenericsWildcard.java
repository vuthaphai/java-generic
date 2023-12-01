package com.vp.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcard {
//    **Can
//    parameter,
//    field
//    local variable
//    return type

//    Cannot
//    invoking a generic method
//    instantiating a generic class

    public static void main(String[] args) {
        List<String> list = List.of("Vutha", "VanchanBormey");
        display(list);

        //Local variable
        List<?> list1 = new ArrayList<>();
//        list1.add("vutha") //error
//        list1.add(34) //eror

        
    }

    //Return type
    public List<?> getList(){
        return null;
    }

    //param
    public static void display(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("hello");
        }
    }

    static class Vutha<T>{

    }

}
