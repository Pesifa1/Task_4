package com.cgvsu.math.matrix;

import com.cgvsu.math.vector.Vector4;


public class Matrix4 extends Matrix {
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

}