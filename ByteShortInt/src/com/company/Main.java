package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int has a width of 32 bit (4 byte)
        int myMinValue= -2147483648;
        int myMaxValue= 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8 bits ( 1 byte = 8 bits)
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        //long has a width of 64
        long myLongValue = 12345L;
    }
}
