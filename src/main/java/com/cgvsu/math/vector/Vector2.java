package com.cgvsu.math.vector;

public class Vector2 extends Vector {

    private static final int n = 2;
    private static final int scalar = 6;

    public Vector2(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors2(Vector2 first, Vector2 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors2(Vector2 first, Vector2 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors2ToScalar(Vector2 vector, float scalar) {
        return multiplyVectorToScalar(vector, n, scalar);
    }

    public static float[] divideVector2ByScalar(Vector2 vector, float scalar) {
        return divideVectorByScalar(vector, n, scalar);
    }

    public static float countVector2Length(Vector2 vector) {
        return countVectorLength(vector, n);
    }

    public static float[] normalizeVector2(Vector2 vector) {
        return normalizeVector(vector, n);
    }

    public static float scalarMultiplyVectors2(Vector2 first, Vector2 second) {
        return scalarMultiplyVectors(first, second, n);
    }

}