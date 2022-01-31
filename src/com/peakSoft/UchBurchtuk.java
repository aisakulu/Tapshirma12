package com.peakSoft;

import java.util.Scanner;

public class UchBurchtuk {
    int a;
    int b;
    int c;

    void area() {
        double areaOfTriangle = (a + b + c) / 2d;
        System.out.println("Area of triangle is: " +" ( " + a + " * " + b + " * " + c + " ) " +
                " / " + 2 + " = " + areaOfTriangle);
    }
}
