package lab01;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
