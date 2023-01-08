package com.cgvsu.math.vector;

public class Vector4f {


    public Vector4 sumOfVectors(Vector4 v1, Vector4 v2) {
        Vector4 res = new Vector4(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ(),
                v1.getK() + v2.getK());
        return res;
    }

    public Vector4 diffOfVectors(Vector4 v1, Vector4 v2) {
        Vector4 res = new Vector4(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ(),
                v1.getK() - v2.getK());
        return res;
    }

    public Vector4 increaseVectorOnNumber(Vector4 v1, float n) {
        Vector4 res = new Vector4(v1.getX() * n, v1.getY() * n, v1.getZ() * n, v1.getK() * n);
        return res;
    }

    public Vector4 divisionVectorOnNumber(Vector4 v1, float n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }
        Vector4 res = new Vector4(v1.getX() / n, v1.getY() / n, v1.getZ() / n, v1.getK() / n);
        return res;
    }

    public float lengthOfVector(Vector4 v1) {
        return (float) Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ() +
                v1.getK() * v1.getK());
    }

    public float scalarProduct(Vector4 v1, Vector4 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ() +
                v1.getK() * v2.getK();
    }

    public Vector4 normalization(Vector4 v1) {
        float invLength = (float) (1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ() +
                v1.getK() * v1.getK())));

        Vector4 res = new Vector4(v1.getX() * invLength, v1.getY() * invLength, v1.getZ() * invLength,
                v1.getK() * invLength);
        return res;
    }


}