package com.daxan.javatesting.util;

public class StringUtilTest {
    public static void main(String[] args) {
        //System.out.println(result);
        assertEquals(StringUtil.repeat("hola", 3),"holaholahola" );


        //System.out.println(result2);
        assertEquals(StringUtil.repeat("hola", 1), "hola");


    }

    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            //System.out.println("ERROR");
            throw new RuntimeException(actual +" no es igual que " + expected);
        }
    }

}