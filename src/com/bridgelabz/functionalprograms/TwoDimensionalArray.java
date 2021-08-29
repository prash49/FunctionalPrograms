package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static Scanner scanner = new Scanner(System.in);

    public static int[][] arrayInt(int size1, int size2) {
        int[][] intArray = new int[size1][size2];
        System.out.println("enter array elements");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                intArray[i][j] = scanner.nextInt();
            }
        }
        return intArray;
    }

    public static double[][] arrayDouble(int size1, int size2) {
        double[][] doubleArray = new double[size1][size2];
        System.out.println("enter array elements");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                doubleArray[i][j] = scanner.nextDouble();
            }
        }
        return doubleArray;
    }

    public static boolean[][] arrayBoolean(int size1, int size2) {
        boolean[][] booleanArray = new boolean[size1][size2];

        System.out.println("enter array elements");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                booleanArray[i][j] = scanner.nextBoolean();
            }
        }
        return booleanArray;
    }

    public static void main(String[] args) {
        System.out.println("Enter the data type of array");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println(" enter the size  2D array");
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        switch (type) {
            case "int" -> {
                int array1[][] = arrayInt(size1, size2);
                System.out.println("Array Elements are");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        System.out.print(array1[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            case "double" -> {
                double[][] array2 = arrayDouble(size1, size2);
                System.out.println("Array Elements are");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        System.out.print(array2[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            case "boolean" -> {
                boolean[][] array3 = arrayBoolean(size1, size2);
                System.out.println("Array Elements are");
                for (int i = 0; i < size1; i++) {
                    for (int j = 0; j < size2; j++) {
                        System.out.print(array3[i][j]);
                        System.out.print("  ");
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("enter valid datatype");
        }
    }
}
