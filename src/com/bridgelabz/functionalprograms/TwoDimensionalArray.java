package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        System.out.println("Enter the data type of array");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int" -> {
                System.out.println(" enter the size  2D array");
                int size1 = scanner.nextInt();
                int size2 = scanner.nextInt();
                int[][] intArray = new int[size1][size2];
                System.out.println("enter array elements");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        intArray[i][j] = scanner.nextInt();
                    }
                }
                System.out.println("Array Elements are");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        System.out.print(intArray[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            case "double" -> {
                System.out.println(" enter the size  2D array");
                int size3 = scanner.nextInt();
                int size4 = scanner.nextInt();
                double[][] doubleArray = new double[size3][size4];
                System.out.println("enter array elements");
                for (int i = 0; i < size3; i++) {
                    for (int j = 0; j < size4; j++) {
                        doubleArray[i][j] = scanner.nextDouble();
                    }
                }
                System.out.println("Array Elements are");
                for (int i = 0; i < size3; i++) {
                    for (int j = 0; j < size4; j++) {
                        System.out.print(doubleArray[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            case "boolean" -> {
                System.out.println(" enter the size  2D array");
                int size5 = scanner.nextInt();
                int size6 = scanner.nextInt();
                boolean[][] booleanArray = new boolean[size5][size6];
                System.out.println("enter array elements");
                for (int i = 0; i < size5; i++) {
                    for (int j = 0; j < size6; j++) {
                        booleanArray[i][j] = scanner.nextBoolean();
                    }
                }
                System.out.println("Array Elements are");
                for (int i = 0; i < size5; i++) {
                    for (int j = 0; j < size6; j++) {
                        System.out.print(booleanArray[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("enter valid datatype");
        }
    }
}
