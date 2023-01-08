package com.cgvsu.math.vector;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector2f {
    public Vector2 sumOfVectors(Vector2 v1, Vector2 v2) {
        Vector2 res = new Vector2(v1.getX() + v2.getX(), v1.getY() + v2.getY());
        return res;
    }

    public Vector2 diffOfVectors(Vector2 v1, Vector2 v2) {
        Vector2 res = new Vector2(v1.getX() - v2.getX(), v1.getY() - v2.getY());
        return res;
    }

    public Vector2 increaseVectorOnNumber(Vector2 v1, float n) {
        Vector2 res = new Vector2(v1.getX() * n, v1.getY() * n);
        return res;
    }

    public Vector2 divisionVectorOnNumber(Vector2 v1, float n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }
        Vector2 res = new Vector2(v1.getX() / n, v1.getY() / n);
        return res;
    }

    public float lengthOfVector(Vector2 v1) {
        return (float) Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY());
    }

    public float scalarProduct(Vector2 v1, Vector2 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

    public Vector2 normalization(Vector2 v1) {
        float invLength = (float) (1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY())));
        Vector2 res = new Vector2(v1.getX() * invLength, v1.getY() * invLength);
        return res;
    }

}