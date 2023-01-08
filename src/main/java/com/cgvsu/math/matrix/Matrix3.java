package com.cgvsu.math.matrix;

import com.cgvsu.math.vector.Vector3;

public class Matrix3{

    public Matrix3(float[][] matrix) {
    }

    /*
    public static void printMatrix3(float[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }*/

    public float[][] sumOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[3][3];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] diffOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[3][3];
        for (int col = 0; col < matrix1[0].length; col++) {
            for (int row = 0; row < matrix1.length; row++) {
                matrixResult[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] increaseDoubleMatrixOnVector(float[][] matrix, Vector3 vector) {
        float[][] matrixResult = new float[3][1];
        float[][] vectorMatrix = new float[3][1];
        vectorMatrix[0][0] = vector.getX();
        vectorMatrix[1][0] = vector.getY();
        vectorMatrix[2][0] = vector.getZ();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrixResult[row][0] += matrix[row][col] * vectorMatrix[col][0];
            }
        }
        return matrixResult;
    }

    public float[][] increaseOfDoubleMatrix(float[][] matrix1, float[][] matrix2) {
        float[][] matrixResult = new float[3][3];

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                for (int i = 0; i < matrix2.length; i++) {
                    matrixResult[row][col] += (matrix1[row][i] * matrix2[i][col]);
                }
            }
        }
        return matrixResult;
    }

    public float[][] transDoubleMatrix(float[][] matrix) {
        float[][] matrixResult = new float[3][3];
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrixResult[col][row] = matrix[row][col];
            }
        }
        return matrixResult;
    }

    public float[][] nullDoubleMatrix() {
        float[][] matrixResult = new float[3][3];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }

    public float[][] oneDoubleMatrix() {
        float[][] matrixResult = new float[3][3];
        for (int row = 0; row < matrixResult[0].length; row++) {
            for (int col = 0; col < matrixResult.length; col++) {
                if(row == col){
                    matrixResult[row][col] = 1;
                    continue;
                }
                matrixResult[row][col] = 0;
            }
        }
        return matrixResult;
    }

}