package com.vp.java.generic;

public class WithoutGenericType {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        WithoutGenericType type = new WithoutGenericType();
        type.setValue(10);
        String st = (String) type.getValue();
        System.out.println(st);

    }
}
