package com.cgvsu.math.vector;

import java.util.Scanner;

public class Vector {
    public float[] vector;
    private static final Scanner scan = new Scanner(System.in);

    public Vector(float[] vector) {
        this.vector = vector;
    }

    public static float[] sumVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = first.vector[i] + second.vector[i];
        }

        return result;
    }

    public static float[] subtractVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            result[i] = first.vector[i] - second.vector[i];
        }

        return result;
    }

    public static float[] multiplyVectorToScalar(Vector vector, int n, float scalar) {
        float[] result = new float[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector.vector[i] * scalar;
        }
        return result;
    }

    public static float[] divideVectorByScalar(Vector vector, int n, float scalar) {
        float[] result = new float[n];
        if (scalar != 0) {
            for (int i = 0; i < n; i++) {
                result[i] = vector.vector[i] / scalar;
            }

        } else {
            System.out.println("Делить на 0 нельзя!");;
        }
        return result;
    }

    public static float countVectorLength(Vector vector, int n) {
        float result = 0;
        for (int i = 0; i < n; i++) {
            result += vector.vector[i] * vector.vector[i];
        }
        return (float) Math.sqrt(result);
    }

    public static float[] normalizeVector(Vector vector, int n) {
        float [] result = vector.vector;
        float leg = countVectorLength(vector, n);

        for (int i = 0; i < vector.vector.length; i++){
            result[i] = vector.vector[i] / leg;
        }
        return result;
    }

    public static float scalarMultiplyVectors(Vector first, Vector second, int n) {
        checkLengths(first, second);
        float result = 0;

        for (int i = 0; i < n; i++) {
            result += first.vector[i] * second.vector[i];
        }

        return result;
    }

    private static void checkLengths(Vector first, Vector second) {
        if (first.vector.length != second.vector.length) {
            throw new IllegalArgumentException("Вектора разной длины!");
        }
    }
}
