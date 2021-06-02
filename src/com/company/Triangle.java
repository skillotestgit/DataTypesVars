package com.company;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, fill in the first angle: ");
        int a = in.nextInt();
        System.out.print("Please, fill in the second angle: ");
        int b = in.nextInt();
        System.out.print("Please, fill in the third angle: ");
        int c = in.nextInt();
        int total = a + b + c;

        if (total == 180 && a > 0 && b > 0 && c > 0) {
            if (a < 90 && b < 90 && c < 90) {
                System.out.println("Acute-angled triangle");
            }
            else if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right-angled triangle");
            }
            else {
                System.out.println("Obtuse triangle");
            }
        }
        else {
            System.out.println("Based on your input, the triangle figure is not possible to be created.");
        }
    }
}
