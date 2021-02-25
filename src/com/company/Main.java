package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int noOfElements = 15;
//        int[] strings1 = new int[noOfElements];
        int noOfElements2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        noOfElements2 = Integer.parseInt(scan.nextLine());
        int[] strings2 = new int[noOfElements2];
        for(int i = 0; i < strings2.length; i++) {
            System.out.println("Enter the " + (i + 1) + ". element:");
            strings2[i] = Integer.parseInt(scan.nextLine());
        }

        print(strings2);

        String[] names = entryOfNames(scan);

        printNames(names);
    }

    public static void print(int[] niz) {
        for(int i = 0; i < niz.length - 1; i++) {
            System.out.print(niz[i] + ", ");
        }
        System.out.println(niz.length - 1 + ".");
    }

    public static String[] entryOfNames(Scanner scan) {
        System.out.println("Enter the number of names:");
        int noOfElements = Integer.parseInt(scan.nextLine());
        String[] names = new String[noOfElements];
        for(int i = 0; i < names.length; i++) {
            System.out.println("Enter the " + (i + 1) + ". name:");
            names[i] = scan.nextLine();
        }
        return names;
    }

    public static void printNames(String[] strings) {
        for(int i = 0; i < strings.length - 1; i++) {
            System.out.print(strings[i] + ", ");
        }
        System.out.println(strings[strings.length - 1] + ".");
    }
}
