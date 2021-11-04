package com.catalin.org;
/*
Author: Kirill Zakrewski
Date: 22.10.2021
*/

public class NumberPrinter {
    public void print() {
        int num;
        int firstN;
        int secondN;

        for(int i = 0; i < 11; i++) {
            num = (int) Math.floor(Math.random() * (100 - 10) + 10);
            firstN = Character.getNumericValue(Integer.toString(num).charAt(0));
            secondN = Character.getNumericValue(Integer.toString(num).charAt(1));
            System.out.print(num);
            if(num % 5 == 0) {
                System.out.printf("(%d) ", firstN + secondN);
            } else {
                System.out.printf("[%d] ", firstN * secondN);
            }
        }
    }

}
