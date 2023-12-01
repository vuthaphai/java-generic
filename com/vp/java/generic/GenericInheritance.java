package com.vp.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericInheritance {
    public static void main(String[] args) {
        String str = "Vutha";
        Object obj = new Object();
        obj = str;

        Vp<String> strG = new Vp<>();
        Vp<Object> objG = new Vp<>();
//        objG = strG; //error
        obj = strG;

        Vutha<Object> subType1 = new Vutha<>();
        objG = subType1;

        Smak<String,Integer> st2 = new Smak<>();
        strG = st2;

        List<Integer> list = new ArrayList<>();

    }

    static class Vp<T>{

    }

    static class Vutha<T> extends Vp<T>{

    }

    static class Smak<T,E> extends Vp<T> {

    }



}
