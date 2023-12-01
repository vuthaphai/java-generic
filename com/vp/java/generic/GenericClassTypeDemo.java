package com.vp.java.generic;

public class GenericClassTypeDemo<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClassTypeDemo<String> typeDemo = new GenericClassTypeDemo<>();
        typeDemo.setValue("Vutha");
        String st = typeDemo.getValue();
        System.out.println(st);

        GenericClassTypeDemo<Integer> typeDemo1 = new GenericClassTypeDemo<>();
        typeDemo1.setValue(37);
        int age = typeDemo1.getValue();

        System.out.println(age);
    }


}
