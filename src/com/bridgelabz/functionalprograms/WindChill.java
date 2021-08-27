package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        // Variables Temperature and wind speed(v)
        double temperature, v, windChill;
        System.out.println("Enter Temperature and Wind Speed");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit");
        temperature = scanner.nextDouble();
        System.out.println("Enter Wind Speed (in miles per hours)");
        v = scanner.nextDouble();
        System.out.println(v);
        if (temperature <= 50.0) {
            if (v > 3.0 && v <= 120.0) {
                windChill = (35.75 + 0.6215 + (0.4275 * temperature - 35.75) * Math.pow(v, 0.16));
                System.out.println("the WindChill is : "+windChill);
            }
        } else System.out.println("temperature should be less than 50 or wind speed is " +
                "greater than 3 or less than 120 miles per hours");
    }
}
