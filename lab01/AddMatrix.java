package lab01;

// Write a Java program to add two matrices of the same size.

public class AddMatrix {
    // Print a matrix
    public static void print(int [][]matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]matrixA = new int[5][5];
        int [][]matrixB = new int[5][5];
        int [][]matrixC = new int[5][5];

        // Generate 2 matrices and calculate sum of them
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrixA[i][j] = i + j;
                matrixB[i][j] = i * j;
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print first matrix
        System.out.println("First matrix:");
        print(matrixA);

        // Print second matrix
        System.out.println("Second matrix:");
        print(matrixB);

        // Print sum of them
        System.out.println("Sum of them:");
        print(matrixC);
    }
}
