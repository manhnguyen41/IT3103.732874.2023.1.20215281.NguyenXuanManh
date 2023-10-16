package lab01;

public class AddMatrix {
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

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrixA[i][j] = i + j;
                matrixB[i][j] = i * j;
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("First matrix:");
        print(matrixA);

        System.out.println("Second matrix:");
        print(matrixB);

        System.out.println("Sum of them:");
        print(matrixC);
    }
}
