package com.cgvsu.math.vector;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector3f {
    public Vector3 sumOfVectors(Vector3 v1, Vector3 v2) {
        Vector3 res = new Vector3(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
        return res;
    }

    public Vector3 diffOfVectors(Vector3 v1, Vector3 v2) {
        Vector3 res = new Vector3(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
        return res;
    }

    public Vector3 increaseVectorOnNumber(Vector3 v1, float n) {
        Vector3 res = new Vector3(v1.getX() * n, v1.getY() * n, v1.getZ() * n);
        return res;
    }

    public Vector3 divisionVectorOnNumber(Vector3 v1, float n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }
        Vector3 res = new Vector3(v1.getX() / n, v1.getY() / n, v1.getZ() / n);
        return res;
    }

    public float lengthOfVector(Vector3 v1) {
        return (float) Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ());
    }

    public float scalarProduct(Vector3 v1, Vector3 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public Vector3 normalization(Vector3 v1) {
        float invLength = (float) (1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ())));

        Vector3 res = new Vector3(v1.getX() * invLength, v1.getY() * invLength, v1.getZ() * invLength);
        return res;
    }

}
