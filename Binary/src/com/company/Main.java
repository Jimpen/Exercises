package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println((binaryStringToInteger("10000000"))); //128
        System.out.println(binaryStringToInteger("00000001")); //1
        System.out.println(binaryStringToInteger("00001111")); //15
        System.out.println(binaryStringToInteger("11110000")); //240
        System.out.println(binaryStringToInteger("01111111")); //127
        System.out.println(binaryStringToInteger("11111111")); //255
    }

    public static int binaryStringToInteger (String input){
        int[] mapping = new int[]{128,64,32,16,8,4,2,1};
        int value = 0;

        for (int i = 0; i < mapping.length ; i++) {
            if (input.charAt(i) == '1'){
                value += mapping[i];
            }
        }
        return value;
    }
}
