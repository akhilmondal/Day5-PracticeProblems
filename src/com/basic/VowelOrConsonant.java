package com.basic;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabate to check: ");
        char alphabate = sc.next().charAt(0);
        switch (alphabate) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabate + " is vowel");
                break;
            default:
                System.out.println(alphabate + " is consonant");
        }
    }
}
