package com.basic;

public class LargestNumber {

    public static void main(String[] args) {

        int number1 = 20, number2 = 30, number3 = 300;

        if( number1 >= number2 && number1 >= number3)
            System.out.println(number1 + " is the largest number.");

        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2 + " is the largest number.");

        else
            System.out.println(number3 + " is the largest number.");
    }
}
