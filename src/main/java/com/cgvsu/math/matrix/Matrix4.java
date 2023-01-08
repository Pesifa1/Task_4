package com.cgvsu.math.matrix;

import com.cgvsu.math.vector.Vector4;


public class Matrix4{ // extends Matrix {

    public Matrix4(float[][] matrix) {
    }

    public float[][] sumOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[4][4];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] difOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[4][4];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] increaseDoubleMatrixOnVector(float[][] matrix, Vector4 vector) {
        float[][] matrixResult = new float[4][1];
        float[][] vectorMatrix = new float[4][1];
        vectorMatrix[0][0] = vector.getX();
        vectorMatrix[1][0] = vector.getY();
        vectorMatrix[2][0] = vector.getZ();
        vectorMatrix[3][0] = vector.getK();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrixResult[row][0] += matrix[row][col] * vectorMatrix[col][0];
            }
        }
        return matrixResult;
    }

    public float[][] increaseOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[4][4];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                for (int i = 0; i < matrix2.length; i++) {
                    matrixResult[row][col] += (matrix1[row][i] * matrix2[i][col]);
                }
            }
        }
        return matrixResult;
    }

    public float[][] transMatrix(float[][] matrix) {
        float[][] matrixResult = new float[4][4];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrixResult[col][row] = matrix[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] nullMatrix() {
        float[][] matrixResult = new float[4][4];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }

    public float[][] oneMatrix() {
        float[][] matrixResult = new float[4][4];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                if(row == col) {
                    matrixResult[row][col] = 1;
                    continue;
                }
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }



    /*
    private static final int N = 16;
    private static final int n = 4;

    public Matrix4(float[] matrix) {
        super(matrix);
    }

    public static float[] sumMatrix4(Matrix4 first, Matrix4 second) {
        return sumMatrix(first, second, N);
    }

    public static float[] subtractMatrix4(Matrix4 first, Matrix4 second) {
        return subtractMatrix(first, second, N);
    }

    public static float[] multiplicationMatrix4(Matrix4 first, Matrix4 second) {
        return multiplicationMatrix(first, second, N, n);
    }

    public static float[] multiplicationMatrix4ToVector4(Matrix4 matrix, Vector4 vector) {
        float[] result = new float[n];


        result[0] = matrix.matrix[0] * vector.vector[0] + matrix.matrix[1] * vector.vector[1] +
                matrix.matrix[2] * vector.vector[2] + matrix.matrix[3] * vector.vector[3];

        result[1] = matrix.matrix[4] * vector.vector[0] + matrix.matrix[5] * vector.vector[1] +
                matrix.matrix[6] * vector.vector[2] + matrix.matrix[7] * vector.vector[3];

        result[2] = matrix.matrix[8] * vector.vector[0] + matrix.matrix[9] * vector.vector[1] +
                matrix.matrix[10] * vector.vector[2] + matrix.matrix[11] * vector.vector[3];

        result[3] = matrix.matrix[12] * vector.vector[0] + matrix.matrix[13] * vector.vector[1] +
                matrix.matrix[14] * vector.vector[2] + matrix.matrix[15] * vector.vector[3];;

        return result;
    }

    public static float[] transpositionMatrix4(Matrix4 matrix) {
        return transpositionMatrix(matrix, N, n);
    }

    public static float[] identityMatrix4() {
        return identityMatrix(N, n);
    }

    public static float[] nullMatrix4() {
        return nullMatrix3(N, n);
    }

     */

}