package com.cgvsu.math.matrix;

import com.cgvsu.math.vector.Vector3;

public class Matrix3 extends Matrix {
    private static final int N = 9;
    private static final int n = 3;

    public Matrix3(float[] matrix) {
        super(matrix);
    }

    public static float[] sumMatrix3(Matrix3 first, Matrix3 second) {
        return sumMatrix(first, second, N);
    }

    public static float[] subtractMatrix3(Matrix3 first, Matrix3 second) {
        return subtractMatrix(first, second, N);
    }

    public static float[] multiplicationMatrix3(Matrix3 first, Matrix3 second) {
        return multiplicationMatrix(first, second, N, n);
    }

    public static float[] multiplicationMatrix3ToVector3(Matrix3 matrix, Vector3 vector) {
        float[] result = new float[n];


        result[0] = matrix.matrix[0] * vector.vector[0] + matrix.matrix[1] * vector.vector[1] + matrix.matrix[2] * vector.vector[2];
        result[1] = matrix.matrix[3] * vector.vector[0] + matrix.matrix[4] * vector.vector[1] + matrix.matrix[5] * vector.vector[2];
        result[2] = matrix.matrix[6] * vector.vector[0] + matrix.matrix[7] * vector.vector[1] + matrix.matrix[8] * vector.vector[2];

        return result;
    }

    public static float[] transpositionMatrix3(Matrix3 matrix) {
        return transpositionMatrix(matrix, N, n);
    }

    public static float[] identityMatrix3() {
        return identityMatrix(N, n);
    }

    public static float[] nullMatrix3() {
        return nullMatrix3(N, n);
    }

}