package test;

import com.cgvsu.math.matrix.Matrix3;
import com.cgvsu.math.matrix.Matrix4;
import com.cgvsu.math.vector.Vector3;
import com.cgvsu.math.vector.Vector4;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//import org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MatrixTest {
    /*
    Matrix3 mat31 = new Matrix3(new float[] {1, 5, 9, 8, 2, 7, 3, 6, 7});
    Matrix3 mat32 = new Matrix3(new float[] {8, 6, 3, 2, 9, 6, 2, 3, 1});


    Matrix4 mat41 = new Matrix4(new float[] {1, 3, 2, 6, 4, 5, 9, 7, 8, 2, 5, 8, 3, 4, 9, 6});
    Matrix4 mat42 = new Matrix4(new float[] {1, 4, 7, 2, 3, 5, 8, 6, 9, 4, 1, 7, 6, 9, 2, 3});


    Vector3 vec3 = new Vector3(new float[] {6, 3, 1});
    Vector4 vec4 = new Vector4(new float[] {3, 6, 2, 1});


    @Test
    public void testSumMatrix3() {
        float[] sum = Matrix3.sumMatrix3(mat31, mat32);
        float[] result = new float[] {9, 11, 12, 10, 11, 13, 5, 9, 8};

        assertArrayEquals(sum, result, 9);
    }

    @Test
    public void testSumMatrix4() {
        float[] sum = Matrix4.sumMatrix4(mat41, mat42);
        float[] result = new float[] {2, 7, 9, 8, 7, 10, 17, 13, 17, 6, 6, 15, 9, 13, 11, 9};
        assertArrayEquals(sum, result,16);
    }

    @Test
    public void testSubtractMatrix3() {
        float[] subtract = Matrix3.subtractMatrix3(mat31, mat32);
        float[] result = new float[] {-7, -1, 6, 6, -7, 1, 1, 3, 6};
        assertArrayEquals(subtract, result,9);
    }

    @Test
    public void testSubtractMatrix4() {
        float[] subtract = Matrix4.subtractMatrix4(mat41, mat42);
        float[] result = new float[] {0, -1, -5, 4, 1, 0, 1, 1, -1, -2, 4, 1, -3, -5, 7, 3};
        assertArrayEquals(subtract, result,16);
    }

    @Test
    public void testMultiplicationMatrix3() {
        float[] multiplication = Matrix3.multiplicationMatrix3(mat31, mat32);
        float[] result = new float[] {36, 78, 42, 82, 87, 43, 50, 93, 52};
        assertArrayEquals(multiplication, result,9);
    }

    @Test
    public void testMultiplicationMatrix4() {
        float[] multiplication = Matrix4.multiplicationMatrix4(mat41, mat42);
        float[] result = new float[] {64, 81, 45, 52, 142, 140, 91, 122, 107, 134, 93, 87, 132,	122, 74, 111};
        assertArrayEquals(multiplication, result,16);
    }

    @Test
    public void testMultiplicationMatrix3ToVector3() {
        float[] multiplicationMatrixToVector = Matrix3.multiplicationMatrix3ToVector3(mat31, vec3);
        float[] result = new float[] {30, 61, 43};
        assertArrayEquals(multiplicationMatrixToVector, result,3);
    }

    @Test
    public void testMultiplicationMatrix4ToVector4() {
        float[] multiplicationMatrixToVector = Matrix4.multiplicationMatrix4ToVector4(mat41, vec4);
        float[] result = new float[] {31, 67, 54, 57};
        assertArrayEquals(multiplicationMatrixToVector, result,4);
    }

    @Test
    public void testTranspositionMatrix3() {
        float[] transposition = Matrix3.transpositionMatrix3(mat31);
        float[] result = new float[] {1, 8, 3, 5, 2, 6, 9, 7, 7};
        assertArrayEquals(transposition, result,9);
    }

    @Test
    public void testTranspositionMatrix4() {
        float[] transposition = Matrix4.transpositionMatrix4(mat41);
        float[] result = new float[] {1, 4, 8, 3, 3, 5, 2, 4, 2, 9, 5, 9, 6, 7, 8, 6};
        assertArrayEquals(transposition, result,16);
    }

    @Test
    public void testIdentityMatrix3() {
        float[] identityMatrix = Matrix3.identityMatrix3();
        float[] result = new float[] {1, 0, 0, 0, 1, 0, 0, 0, 1};
        assertArrayEquals(identityMatrix, result, 9);
    }

    @Test
    public void testIdentityMatrixMatrix4() {
        float[] identityMatrix = Matrix4.identityMatrix4();
        float[] result = new float[] {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};
        assertArrayEquals(identityMatrix, result, 16);
    }

    @Test
    public void testNullMatrix3() {
        float[] nullMatrix3 = Matrix3.nullMatrix3();
        float[] result = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(nullMatrix3, result, 9);
    }

    @Test
    public void testNullMatrix4() {
        float[] nullMatrix = Matrix4.nullMatrix4();
        float[] result = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(nullMatrix, result, 16);
    }

     */



}