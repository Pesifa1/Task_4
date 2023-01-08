package com.cgvsu.math.affine_transformations;

import com.cgvsu.math.matrix.Matrix3;
import com.cgvsu.math.matrix.Matrix4;
import com.cgvsu.math.vector.Vector3;

import static org.junit.Assert.assertArrayEquals;

public class affine {

    /**
     * Масштабирование (Scale)
     * Поворот (Rotation)
     * Смещение (Translation)
     */

    public static Matrix4 scale(Vector3 vS){ //Масштабирование
        float[][] matrix = new float[][]{
                {vS.getX(), 0, 0, 0},
                {0, vS.getY(), 0, 0},
                {0, 0, vS.getZ(), 0},
                {0, 0, 0, 1}
        };
        return new Matrix4(matrix);
    }

    public static Matrix4 rotate(Vector3 vR){ //Поворот
        float sinX = (float) Math.sin(vR.getX());
        float cosX = (float) Math.cos(vR.getX());
        float sinY = (float) Math.sin(vR.getY());
        float cosY = (float) Math.cos(vR.getY());
        float sinZ = (float) Math.sin(vR.getZ());
        float cosZ = (float) Math.cos(vR.getZ());
        float[][] matrix = new float[][] {
                {cosY * cosZ, sinX * sinY * cosZ - cosX * sinZ, cosX * sinY * cosZ + sinX * sinZ, 0},
                {cosY * sinZ, sinX * sinY * sinZ + cosX * cosZ, cosX * sinY * sinZ - sinX * cosZ, 0},
                {-sinY, sinX * cosY, cosX * cosY, 0},
                {0, 0, 0, 1}
        };
        return new Matrix4(matrix);
    }

    public static Matrix4 translate(Vector3 vT){ //Смещение
        float[][] matrix = new float[][]{
                {1, 0, 0, vT.getX()},
                {0, 1, 0, vT.getY()},
                {0, 0, 1, vT.getZ()},
                {0, 0, 0, 1}
        };
        return new Matrix4(matrix);
    }

}
