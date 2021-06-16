package com.daxan.javatesting.util;

public class StringUtil {
    public static String repeat(String str, int times) {

        if (times < 0){
            throw new IllegalArgumentException("No esta permitido que el numero de repeticiones sea negativo");
        }

        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;

        }
        return result;
    }
}
