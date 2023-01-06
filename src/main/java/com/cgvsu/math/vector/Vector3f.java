package com.cgvsu.math.vector;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector3f {

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vector3f other) {
        final float eps = 1e-7f;
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps && Math.abs(z - other.z) < eps;
    }

    public float x, y, z;

    public static Vector3f sumVectors3(Vector3f vec1, Vector3f vec2) {
        Vector3f res = new Vector3f(vec1.x + vec2.x, vec1.y + vec2.y, vec1.z + vec2.z);
        return res;
    }

    public static Vector3f subtractVectors3(Vector3f vec1, Vector3f vec2) {
        Vector3f res = new Vector3f(vec1.x - vec2.x, vec1.y - vec2.y, vec1.z - vec2.z);
        return res;
    }

    public static Vector3f multiplicationVectors3ByScalar(Vector3f vec1, float n) {
        Vector3f res = new Vector3f(vec1.x * n, vec1.y * n, vec1.z * n);
        return res;
    }

    public static Vector3f divisionVectors3ByScalar(Vector3f vec1, float n) {
        if (n == 0){
            System.out.println("Ошибка! На ноль делить нельзя!");
        }
        Vector3f res = new Vector3f(vec1.x / n, vec1.y / n, vec1.z / n);
        return res;
    }

    public static float lengthVectors3(Vector3f vec1) {
        return (float) Math.sqrt((vec1.x * vec1.x) + (vec1.y * vec1.y) + (vec1.z * vec1.z));
    }

    public static Vector3f normalizationVectors3(Vector3f vec1) {
        float leg = lengthVectors3(vec1);
        vec1 = divisionVectors3ByScalar(vec1, leg);
        return vec1;
    }

    public static float dotProductVectors3(Vector3f vec1, Vector3f vec2) {
        return vec1.x * vec2.x + vec1.y * vec2.y + vec1.z * vec2.z;
    }

    public static Vector3f productVectors3(Vector3f vec1, Vector3f vec2) {
        Vector3f res = new Vector3f((vec1.y * vec2.z - vec1.z * vec2.y),
                (vec1.z * vec2.x - vec1.x * vec2.z), (vec1.x * vec2.y - vec1.y * vec2.x));
        return res;
    }
}
