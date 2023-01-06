package com.cgvsu.math.vector;

public class Vector4f {

    public Vector4f(float x, float y, float z, float k) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.k = k;
    }

    public float x, y, z, k;

    public static Vector4f sumVectors4(Vector4f vec1, Vector4f vec2) {
        Vector4f res = new Vector4f(vec1.x + vec2.x, vec1.y + vec2.y, vec1.z + vec2.z,vec1.k + vec2.k);
        return res;
    }

    public static Vector4f subtractVectors4(Vector4f vec1, Vector4f vec2) {
        Vector4f res = new Vector4f(vec1.x - vec2.x, vec1.y - vec2.y, vec1.z - vec2.z, vec1.k - vec2.k);
        return res;
    }

    public static Vector4f multiplicationVectors4ByScalar(Vector4f vec1, float n) {
        Vector4f res = new Vector4f(vec1.x * n, vec1.y * n, vec1.z * n, vec1.k * n);
        return res;
    }

    public static Vector4f divisionVectors4ByScalar(Vector4f vec1, float n) {
        if (n == 0){
            System.out.println("Ошибка! На ноль делить нельзя!");
        }
        Vector4f res = new Vector4f(vec1.x / n, vec1.y / n, vec1.z / n, vec1.k / n);
        return res;
    }

    public static float lengthVectors4(Vector4f vec1) {
        return (float) Math.sqrt((vec1.x * vec1.x) + (vec1.y * vec1.y) + (vec1.z * vec1.z) + (vec1.k * vec1.k));
    }

    public static Vector4f normalizationVectors4(Vector4f vec1) {
        float leg = lengthVectors4(vec1);
        vec1 = divisionVectors4ByScalar(vec1, leg);
        return vec1;
    }

    public static float dotProductVectors4(Vector4f vec1, Vector4f vec2) {
        return vec1.x * vec2.x + vec1.y * vec2.y + vec1.z * vec2.z + vec1.k * vec2.k;
    }

}