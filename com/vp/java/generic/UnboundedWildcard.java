package com.vp.java.generic;

import java.util.List;
import java.util.Objects;

public class UnboundedWildcard {
    public static void main(String[] args) {
        List<String> listsString = List.of("Vutha", "Vannchanbormey");
        printData(listsString);

        List<Integer> listInt = List.of(1,2,3,4);
        printData(listInt);

//        printDataObject(listsString);
//        printDataObject(listInt);
    }

    private static void printData(List<?> lists) {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    private static void printDataObject(List<Objects> lists) {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }


}
