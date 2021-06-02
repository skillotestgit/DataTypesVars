package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName = "M";
        String middleName = "Y";
        String lastName = "G";
        System.out.println(
                firstName + " " + middleName + " " + lastName
        );
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(
                a+b+c
        );
        System.out.println((a*b)/2);

        System.out.println(" " + "*");
        System.out.println(""+"*"+"*");
        System.out.println("*"+"*"+"*");
    }
}
