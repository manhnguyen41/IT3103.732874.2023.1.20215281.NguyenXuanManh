package lab01;

import java.util.Scanner;

public class SolveFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double [][]matrixA = new double[3][3];
        double []matrixB = new double[3];

        // The first-degree equation (linear equation) with one variable
        System.out.println("The first-degree equation (linear equation) with one variable:");
        // Input a and b
        System.out.print("Input a: ");
        a = scanner.nextDouble();
        System.out.print("Input b: ");
        b = scanner.nextDouble();
        // Calculate and display
        if (a == 0) {
            if (b == 0) {
                System.out.println("Many solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            System.out.println("x = " + -b / a);
        }

        // The system of first-degree equations (linear system) with two variables
        System.out.println("The system of first-degree equations (linear system) with two variables:");
        // Input matrixA and matrixB
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("a" + i + j + " = ");
                matrixA[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("b" + i + " = ");
            matrixB[i] = scanner.nextDouble();
        }
        // Calculate and display
        double d = matrixA[1][1] * matrixA[2][2] - matrixA[2][1] * matrixA[1][2];
        double d1 = matrixB[1] * matrixA[2][2] - matrixB[2] * matrixA[1][2];
        double d2 = matrixA[1][1] * matrixB[2] - matrixA[2][1] * matrixB[1];
        if (d == 0) {
            if (matrixB[2] / matrixB[1] == matrixA[2][1] / matrixA[1][1]) {
                System.out.println("Many solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            System.out.println("x1 = " + d1 / d);
            System.out.println("x2 = " + d2 / d);
        }

        // The second-degree equation with one variable
        System.out.println("The second-degree equation with one variable:");
        // Input a, b and c
        System.out.print("Input a: ");
        a = scanner.nextDouble();
        System.out.print("Input b: ");
        b = scanner.nextDouble();
        System.out.print("Input c: ");
        c = scanner.nextDouble();
        // Calculate and display
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("No solution");
        } else {
            if (delta == 0) {
                System.out.println("x = " + -b / 2 / a);
            } else {
                System.out.println("x1 = " + (-b - Math.sqrt(delta)) / 2 / a + "x2 = " + (-b + Math.sqrt(delta)) / 2 / a);
            }
        }
    }
}