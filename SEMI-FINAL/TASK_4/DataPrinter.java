package com.catalin.org;
/*
Author: Kirill Zakrewski
Date: 22.10.2021
*/

public class DataPrinter {
    String name = "Kirill";
    String surname = "Zakrewski";
    String number = "+79648686527";

    DataPrinter() {}

    DataPrinter(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public void print() {
        String nameSurnameLine = name + " " + surname;
        int maxLength = Math.max(nameSurnameLine.length(), number.length());

        for(int i = 0; i < maxLength + 4; i++) {
            System.out.print("*");
        }

        if(nameSurnameLine.length() > number.length()) {
            System.out.printf("\n* %s *\n", nameSurnameLine);
            System.out.printf("* %s", number);
            for(int i = nameSurnameLine.length() - number.length(); i > 0; i--) {
                System.out.print(" ");
            }
            System.out.println(" *");
        } else {
            System.out.printf("\n* %s", nameSurnameLine);
            for(int i = number.length() - nameSurnameLine.length(); i > 0; i--) {
                System.out.print(" ");
            }
            System.out.println(" *");
            System.out.printf("* %s *\n", number);
        }

        for(int i = 0; i < maxLength + 4; i++) {
            System.out.print("*");
        }
    }
}