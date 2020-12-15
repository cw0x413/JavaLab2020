package day2;

import java.util.Scanner;

public class matrixmult {
    Scanner sc = new Scanner(System.in);
    int[][] mat1;
    int[][] mat2;
    int[][] mat3;

    matrixmult() {
        mat1 = new int[3][3];
        mat2 = new int[3][3];
        mat3 = new int[3][3];
    }

    void readmatrix(int[][] mat) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = sc.nextInt();
    }

    int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] toReturn = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    toReturn[i][j] += matrix1[i][k] * matrix2[k][j];
        return toReturn;
    }

    public static void main(String[] args) {
        matrixmult mm = new matrixmult();
        int[][] matrix1 = new int[3][3];
        mm.readmatrix(matrix1);
        int[][] matrix2 = new int[3][3];
        mm.readmatrix(matrix2);
        int[][] multipliedmatrix = mm.multiply(matrix1, matrix2);
        System.out.println("Displaying multipled matrix");
        for (int x[] : multipliedmatrix) {
            for (int y : x)
                System.out.println(y + " ");
            System.out.println();
        }
    }
}