package com.company;

public class Main {

    public static void main(String[] args) {

        // width of int 32(4 byte)
        int myIntValue = 5/3;
        //width of float 32
        float myFloatValue =  5f / 3f;
        //width of double is 64(8 byte). Decimals are stored as double by default
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println(("myFloatValue = " + myFloatValue));
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
