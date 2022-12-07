package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        System.out.println("enter scrolloy");
        n = scanner.nextInt();
        System.out.println("enter orex");
        k = scanner.nextInt();
        scanner.close();

        int count = k/n;
        System.out.println( "orexi = " + count);
    }
    public static void main2() {

    }
}