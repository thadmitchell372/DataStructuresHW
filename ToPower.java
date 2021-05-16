package com.company;

import java.util.Scanner;

public class ToPower {
    public static void toPower() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your size: ");
        int size = input.nextInt();
        System.out.println("Please enter your power: ");
        int power = input.nextInt();

        int numArray[] = new int [size];

        for (int i=0;i<numArray.length;i++){
            numArray[i]= (int) Math.pow(i,power);
            System.out.println(numArray[i]);
        }
    }
}
