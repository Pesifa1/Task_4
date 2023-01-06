package com.cgvsu.math.vector;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector2f {

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float x, y;

    public static Vector2f sumVectors2(Vector2f vec1, Vector2f vec2) {
        Vector2f res = new Vector2f(vec1.x + vec2.x, vec1.y + vec2.y);
        return res;
    }

    public static Vector2f subtractVectors2(Vector2f vec1, Vector2f vec2) {
        Vector2f res = new Vector2f(vec1.x - vec2.x, vec1.y - vec2.y);
        return res;
    }

    public static Vector2f multiplicationVectors2ByScalar(Vector2f vec1, float n) {
        Vector2f res = new Vector2f(vec1.x * n, vec1.y * n);
        return res;
    }

    public static Vector2f divisionVectors2ByScalar(Vector2f vec1, float n) {
        if (n == 0){
            System.out.println("Ошибка! На ноль делить нельзя!");
        }
        Vector2f res = new Vector2f(vec1.x / n, vec1.y / n);
        return res;
    }

    public static float lengthVectors2(Vector2f vec1) {
        return (float) Math.sqrt((vec1.x * vec1.x) + (vec1.y * vec1.y));
    }

    public static Vector2f normalizationVectors2(Vector2f vec1) {
        float leg = lengthVectors2(vec1);
        vec1 = divisionVectors2ByScalar(vec1, leg);
        return vec1;
    }

    public static float dotProductVectors2(Vector2f vec1, Vector2f vec2) {
        return vec1.x * vec2.x + vec1.y * vec2.y;
    }
}