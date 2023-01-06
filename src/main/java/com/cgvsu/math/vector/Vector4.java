package com.cgvsu.math.vector;

public class Vector4 extends Vector {

    private static final int n = 4;
    private static final int scalar = 6;

    public Vector4(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors4(Vector4 first, Vector4 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors4(Vector4 first, Vector4 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors4ToScalar(Vector4 vector, float scalar) {
        return multiplyVectorToScalar(vector, n, scalar);
    }

    public static float[] divideVector4ByScalar(Vector4 vector, float scalar) {
        return divideVectorByScalar(vector, n, scalar);
    }

    public static float countVector4Length(Vector4 vector) {
        return countVectorLength(vector, n);
    }

    public static float[] normalizeVector4(Vector4 vector) {
        return normalizeVector(vector, n);
    }

    public static float scalarMultiplyVectors4(Vector4 first, Vector4 second) {
        return scalarMultiplyVectors(first, second, n);
    }
}
