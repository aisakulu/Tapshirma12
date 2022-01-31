package com.peakSoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UchBurchtuk esepArea = new UchBurchtuk();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first side: ");
        esepArea.a = scanner.nextInt();

        System.out.print("Enter second side: ");
        esepArea.b = scanner.nextInt();

        System.out.print("Enter third side: ");
        esepArea.c = scanner.nextInt();

        esepArea.area();

    }
}
