package com.KomSoft.lection6;

public interface MyData {
    default void print(String str) {
        if (!isNull(str)) System.out.println("MyData Class. Print string: " + str);
    }

    static boolean isNull(String str) {
        System.out.println("Static method isNull");
        return str == null ? true : "".equals(str) ? true : false;
    }


}
