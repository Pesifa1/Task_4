package com.cgvsu.math.matrix;

import java.util.Scanner;

public class Matrix {
    protected float[] matrix;
    private static final Scanner scan = new Scanner(System.in);

    protected Matrix(float[] matrix) {
        this.matrix = matrix;
    }

    protected Matrix(int N) {
        this.matrix = new float[N];
    }

    protected static float[] sumMatrix(Matrix first, Matrix second, int N) {
        float[] result = new float[N];
        for (int i = 0; i < N; i++) {
            result[i] = first.matrix[i] + second.matrix[i];
        }
        return result;
    }

    protected static float[] subtractMatrix(Matrix first, Matrix second, int N) {
        float[] result = new float[N];
        for (int i = 0; i < N; i++) {
            result[i] = first.matrix[i] - second.matrix[i];
        }
        return result;
    }

    protected static float[] multiplicationMatrix(Matrix first, Matrix second, int N, int n) {
        float[] result = new float[N];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    result[i * n + j] += first.matrix[i * n + k] * second.matrix[k * n + j];
                }
            }
        }

        return result;
    }

    protected static float[] transpositionMatrix(Matrix matrix, int N, int n) {
        float[] result = new float[N];
        float[][] matrixT = new float[n][n];
        float[][] matrixA = new float[n][n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix.matrix.length > count) {
                    matrixA[i][j] = matrix.matrix[count++];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixT[j][i] = matrixA[i][j];
            }
        }

        return transformMatrixToArray(n, result, matrixT);
    }

    private static float[] transformMatrixToArray(int n, float[] array, float[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * matrix[0].length + j;
                array[k] = matrix[i][j];
            }
        }
        return array;
    }

    protected static float[] identityMatrix(int N, int n) {
        float[] result = new float[N];
        float[][] identityMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                }
                else {
                    identityMatrix[i][j] = 0;
                }
            }
        }

        return transformMatrixToArray(n, result, identityMatrix);
    }

    protected static float[] nullMatrix3(int N, int n) {
        float[] result = new float[N];
        float[][] nullMatrix = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nullMatrix[i][j] = 0;
            }
        }

        return transformMatrixToArray(n, result, nullMatrix);
    }

    public static float[] readMatrix(int N) {
        float[] result = new float[N];

        while (true) {
            try {
                for (int i = 0; i < N; i++) {
                    result[i] = scan.nextFloat();
                }
                return result;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные! Попробуйте ввести матрицу ещё раз: ");
                scan.next();
            }
        }
    }

    public static void printMatrix(float[] matrix, int N, int n) {
        for (int i = 0, j = 0; i < N; i++, j++) {
            if (j == n) {
                System.out.println();
                j = 0;
            }
            System.out.print(matrix[i] + " ");
        }
    }


}
