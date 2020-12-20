import java.util.Scanner;

public class matrixmult {
    Scanner sc = new Scanner(System.in);
    int[][] mat1;
    int[][] mat2;
    int[][] mat3;

    matrixmult(int row1, int col1, int row2, int col2) {
        mat1 = new int[row1][col1];
        mat2 = new int[row2][col2];
        mat3 = new int[row1][col2];
    }

    void readmatrix(int[][] mat, int rows, int cols) {
        System.out.println("Enter " + rows + " rows and " + cols + " columns");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();
    }

    int[][] multiply(int[][] matrix1, int row1, int col1, int[][] matrix2, int row2, int col2) {
        int[][] toReturn = new int[row1][col2];
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col2; j++)
                for (int k = 0; k < row2; k++)
                    toReturn[i][j] += matrix1[i][k] * matrix2[k][j];
        return toReturn;
    }

    void displayMatrix(int[][] matrix) {
        System.out.println("Displaying multipled matrix");
        for (int x[] : matrix) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of first matrix and second matrix eg 1 2 2 1");
        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();
        if (col1 != row2) {
            System.err.println("Matrix multiplication not possible ");
            System.exit(0);
        }
        matrixmult mm = new matrixmult(row1, col1, row2, col2);
        mm.readmatrix(mm.mat1, row1, col1);
        mm.readmatrix(mm.mat2, row2, col2);
        mm.mat3 = mm.multiply(mm.mat1, row1, col1, mm.mat2, row2, col2);
        mm.displayMatrix(mm.mat3);
    }
}