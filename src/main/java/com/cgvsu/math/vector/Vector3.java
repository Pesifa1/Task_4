package com.cgvsu.math.vector;

public class Vector3{
    // extends Vector {

    public float x, y, z;

    public Vector3(float x, float y, float z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public  float getZ() {
        return z;
    }



















    /*
    private static final int n = 3;
    private static final int scalar = 6;

    public Vector3(float[] vector) {
        super(vector);
    }

    public static float[] sumVectors3(Vector3 first, Vector3 second) {
        return sumVectors(first, second, n);
    }

    public static float[] subtractVectors3(Vector3 first, Vector3 second) {
        return subtractVectors(first, second, n);
    }

    public static float[] multiplyVectors3ToScalar(Vector3 vector, float scalar) {
        return multiplyVectorToScalar(vector, n, scalar);
    }

    public static float[] divideVector3ByScalar(Vector3 vector, float scalar) {
        return divideVectorByScalar(vector, n, scalar);
    }

    public static float countVector3Length(Vector3 vector) {
        return countVectorLength(vector, n);
    }

    public static float[] normalizeVector3(Vector3 vector) {
        return normalizeVector(vector, n);
    }

    public static float scalarMultiplyVectors3(Vector3 first, Vector3 second) {
        return scalarMultiplyVectors(first, second, n);
    }

    public static float[] productVectors3(Vector3 first, Vector3 second) {
        float[] result = new float[n];

        result[0] = first.vector[1] * second.vector[2] - first.vector[2] * second.vector[1];
        result[1] = first.vector[2] * second.vector[0] - first.vector[0] * second.vector[2];
        result[2] = first.vector[0] * second.vector[1] - first.vector[1] * second.vector[0];

        return result;
    }

    public static float[][] columnVector3(Vector3 vector) {
        return columnVector(vector, n);
    }

     */
}
