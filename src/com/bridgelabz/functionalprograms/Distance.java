package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        //Variables
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the X and Y to Find Euclidean distance");
        System.out.println(" Enter X:");
        x=scanner.nextInt();
        System.out.println(" Enter Y:");
        y=scanner.nextInt();
        //Formula to Calculate Euclidean distance from (0,0) to (X ,Y)
        double distance=  Math.sqrt((x * x) + (y * y));
        System.out.println("Euclidean distance from the point (x, y) to the origin ( 0 , 0):"+distance);
    }
}
