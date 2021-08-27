package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumThreeIntegerToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int number = scanner.nextInt();
        int tripletCount = 0;
        //creating a array to store the elements
        int[] arrayStore = new int[number];
        //Storing the Elements into Array
        System.out.println("Enter the Elements ");
        for (int i = 0; i < number; i++) {
            System.out.print("Enter element " + i + ":");
            arrayStore[i] = scanner.nextInt();
        }

        /* Itirating the array elements to find sum of 3 integer is zero
        ex: array[ -1 , -2 ,3 ,7] 4 array elements but -1 -2 +3 sums zero count increases
         so are disntinct elements to display */
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                    //Checking whether the three elements sums equals zero
                    if (arrayStore[i] + arrayStore[j] + arrayStore[k] == 0) {
                        tripletCount++;
                        System.out.println("distinct triplets are:" + arrayStore[i] + " , " + arrayStore[j] + " , " + arrayStore[k] + " are 3 triplets that sums to ZERO");
                    }
                }
            }
        }
        // Displaying the only tripletd
        System.out.println("Number of  Distinct triplets present in the Array = " + tripletCount);
    }
}
