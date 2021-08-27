package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        /*  quadratic equation ax^2+bx+c=0 where x is
            x=(-b+((b*b)-4ac))/2a) and x=(-b-((b*b)-4ac))/2a)
         */
        //variables
        double a, b, c;
        System.out.println("enter the Quadratic Equation inputs A , B , C");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A value:\n");
        a = scanner.nextDouble();
        System.out.print("Enter B value:\n");
        b = scanner.nextDouble();
        System.out.print("Enter C value:\n");
        c = scanner.nextDouble();
        // formula
        double delta = (b * b) - (4.0 * a * c);
        System.out.println(delta);
        double sqDelta = Math.sqrt(delta);
        double root1 = (-b + sqDelta / (2.0 * a));
        double root2 = (-b - sqDelta / (2.0 * a));
        System.out.println("X roots are:" + root1 + "  " + root2);
    }
}
