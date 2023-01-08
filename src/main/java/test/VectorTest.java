package test;

import com.cgvsu.math.vector.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VectorTest {
    /*

    Vector2f v21f = new Vector2f(3, 6);
    Vector2f v22f = new Vector2f(8, 9);

    Vector3f v31f = new Vector3f(2, 5, 9);
    Vector3f v32f = new Vector3f(4, 6, 8);

    Vector4f v41f = new Vector4f(2, 6, 8, 2);
    Vector4f v42f = new Vector4f(7, 2, 9, 5);

    Vector2 v21 = new Vector2(new float[] {3, 6});
    Vector2 v22 = new Vector2(new float[] {8, 9});

    Vector3 v31 = new Vector3(new float[] {2, 5, 9});
    Vector3 v32 = new Vector3(new float[] {4, 6, 8});

    Vector4 v41 = new Vector4(new float[] {2, 6, 8, 2});
    Vector4 v42 = new Vector4(new float[] {7, 2, 9, 5});

    @Test
    public void testSumVectors2f() {
       Vector2f sum = Vector2f.sumVectors2(v21f, v22f);
       Vector2f res = new Vector2f(11, 15);
       assertEquals(sum.x, res.x,2);
       assertEquals(sum.y, res.y, 2);
    }

    @Test
    public void testSubtractVectors2f() {
        Vector2f subtraction = Vector2f.subtractVectors2(v21f, v22f);
        Vector2f result = new Vector2f(-5, -3);
        assertEquals(subtraction.x, result.x,2);
        assertEquals(subtraction.y, result.y,2);
    }

    @Test
    public void testMultiplicationVectors2ByScalar() {
        Vector2f multiplication = Vector2f.multiplicationVectors2ByScalar(v21f, 2);
        Vector2f result = new Vector2f(6, 12);
        assertEquals(multiplication.x, result.x,2);
        assertEquals(multiplication.y, result.y,2);
    }

    @Test
    public void testDivisionVectors2ByScalar() {
        Vector2f division = Vector2f.divisionVectors2ByScalar(v21f, 3);
        Vector2f result = new Vector2f(1, 2);
        assertEquals(division.x, result.x,2);
        assertEquals(division.y, result.y,2);
    }

    @Test
    public void testLengthVectors2f() {
        float length = Vector2f.lengthVectors2(v21f);
        float result = 6.708203932499369F;
        assertEquals(length, result,1);
    }

    @Test
    public void testNormalizationVectors2() {
        Vector2f normalization = Vector2f.normalizationVectors2(v21f);
        Vector2f result = new Vector2f(0.4472136F, 0.8944272F);
        assertEquals(normalization.x, result.x,2);
        assertEquals(normalization.y, result.y,2);
    }

    @Test
    public void testDotProductVectors2f() {
        float dot = Vector2f.dotProductVectors2(v21f, v22f);
        float result = 78;
        assertEquals(dot, result,1);
    }

    @Test
    public void testSumVectors3f() {
        Vector3f sum = Vector3f.sumVectors3(v31f, v32f);
        Vector3f res = new Vector3f(6, 11, 17);
        assertEquals(sum.x, res.x,2);
        assertEquals(sum.y, res.y,2);
        assertEquals(sum.z, res.z,2);
    }

    @Test
    public void testSubtractVectors3f() {
        Vector3f subtraction = Vector3f.subtractVectors3(v31f, v32f);
        Vector3f result = new Vector3f(-2, -1, 1);
        assertEquals(subtraction.x, result.x,2);
        assertEquals(subtraction.y, result.y,2);
        assertEquals(subtraction.z, result.z,2);
    }

    @Test
    public void testMultiplicationVectors3ByScalar() {
        Vector3f multiplication = Vector3f.multiplicationVectors3ByScalar(v31f, 2);
        Vector3f result = new Vector3f(4, 10, 18);
        assertEquals(multiplication.x, result.x,2);
        assertEquals(multiplication.y, result.y,2);
        assertEquals(multiplication.z, result.z,2);
    }

    @Test
    public void testDivisionVectors3ByScalar() {
        Vector3f division = Vector3f.divisionVectors3ByScalar(v32f, 2);
        Vector3f result = new Vector3f(2, 3, 4);
        assertEquals(division.x, result.x,2);
        assertEquals(division.y, result.y,2);
        assertEquals(division.z, result.z,2);
    }

    @Test
    public void testLengthVectors3f() {
        float length = Vector3f.lengthVectors3(v31f);
        float result = 10.488088481701515F;
        assertEquals(length, result,1);
    }

    @Test
    public void testNormalizationVectors3() {
        Vector3f normalization = Vector3f.normalizationVectors3(v31f);
        Vector3f result = new Vector3f(0.19069251F, 0.4767313F, 0.8581163F);
        assertEquals(normalization.x, result.x,2);
        assertEquals(normalization.y, result.y,2);
    }

    @Test
    public void testDotProductVectors3f() {
        float dot = Vector3f.dotProductVectors3(v31f, v32f);
        float result = 110;
        assertEquals(dot, result,1);
    }

    @Test
    public void testProductVectors3f() {
        Vector3f product = Vector3f.productVectors3(v31f,v32f);
        Vector3f result = new Vector3f(-14, 20, -8);
        assertEquals(product.x, result.x,2);
        assertEquals(product.y, result.y,2);
        assertEquals(product.z, result.z,2);
    }

    @Test
    public void testSumVectors4f() {
        Vector4f sum = Vector4f.sumVectors4(v41f, v42f);
        Vector4f res = new Vector4f(9, 8, 17, 7);
        assertEquals(sum.x, res.x,2);
        assertEquals(sum.y, res.y,2);
        assertEquals(sum.z, res.z,2);
        assertEquals(sum.k, res.k,2);
    }

    @Test
    public void testSubtractVectors4f() {
        Vector4f sum = Vector4f.subtractVectors4(v41f, v42f);
        Vector4f result = new Vector4f(-5, 4, -1, -3);
        assertEquals(sum.x, result.x,2);
        assertEquals(sum.y, result.y,2);
        assertEquals(sum.z, result.z,2);
        assertEquals(sum.k, result.k,2);
    }

    @Test
    public void testMultiplicationVectors4ByScalar() {
        Vector4f multiplication = Vector4f.multiplicationVectors4ByScalar(v41f, 2);
        Vector4f result = new Vector4f(4, 12, 16, 4);
        assertEquals(multiplication.x, result.x,2);
        assertEquals(multiplication.y, result.y,2);
        assertEquals(multiplication.z, result.z,2);
        assertEquals(multiplication.k, result.k,2);
    }

    @Test
    public void testDivisionVectors4ByScalar() {
        Vector4f division = Vector4f.divisionVectors4ByScalar(v41f, 2);
        Vector4f result = new Vector4f(1, 3, 4, 1);
        assertEquals(division.x, result.x,2);
        assertEquals(division.y, result.y,2);
        assertEquals(division.z, result.z,2);
        assertEquals(division.k, result.k,2);
    }

    @Test
    public void testLengthVectors4f() {
        float length = Vector4f.lengthVectors4(v41f);
        float result = 10.392304845413264F;
        assertEquals(length, result,2);
    }

    @Test
    public void testNormalizationVectors4() {
        Vector4f normalization = Vector4f.normalizationVectors4(v41f);
        Vector4f result = new Vector4f(0.19245009F, 0.5773503F,0.76980036F, 0.19245009F);
        assertEquals(normalization.x, result.x,2);
        assertEquals(normalization.y, result.y,2);
        assertEquals(normalization.z, result.z,2);
        assertEquals(normalization.k, result.k,2);
    }

    @Test
    public void testDotProductVectors4f() {
        float dot = Vector4f.dotProductVectors4(v41f, v42f);
        float result = 108;
        assertEquals(dot, result,1);
    }

    @Test
    public void testSumVectors2() {
        float[] sum = Vector2.sumVectors2(v21, v22);
        float[] result = new float[] {11, 15};
        assertArrayEquals(sum, result,2);
    }

    @Test
    public void testSumVectors3() {
        float[] sum = Vector3.sumVectors3(v31, v32);
        float[] result = new float[] {6, 11, 17};
        assertArrayEquals(sum, result,3);
    }

    @Test
    public void testSumVectors4() {
        float[] sum = Vector4.sumVectors4(v41, v42);
        float[] result = new float[] {9, 8, 17, 7};
        assertArrayEquals(sum, result,4);
    }

    @Test
    public void testSubtractVectors2() {
        float[] subtract = Vector2.subtractVectors2(v21, v22);
        float[] result = new float[] {-5F, -3F};
        assertArrayEquals(subtract, result,2);
    }

    @Test
    public void testSubtractVectors3() {
        float[] subtract = Vector3.subtractVectors3(v31, v32);
        float[] result = new float[] {-2, -1, 1};
        assertArrayEquals(subtract, result,3);
    }

    @Test
    public void testSubtractVectors4() {
        float[] subtract = Vector4.subtractVectors4(v41, v42);
        float[] result = new float[] {-5, 4, -1, -3};
        assertArrayEquals(subtract, result,4);
    }

    @Test
    public void testMultiplyVector2ToScalar() {
        float[] multiply = Vector2.multiplyVectors2ToScalar(v21, 2);
        float[] result = new float[] {6, 12};
        assertArrayEquals(multiply, result,2);
    }

    @Test
    public void testMultiplyVector3ToScalar() {
        float[] multiply = Vector3.multiplyVectors3ToScalar(v31, 2);
        float[] result = new float[] {4, 10, 18};
        assertArrayEquals(multiply, result,3);
    }

    @Test
    public void testMultiplyVector4ToScalar() {
        float[] multiply = Vector4.multiplyVectors4ToScalar(v41, 2);
        float[] result = new float[] {4, 12, 16, 4};
        assertArrayEquals(multiply, result,4);
    }

    @Test
    public void testDivideVector2ToScalar() {
        float[] divide = Vector2.divideVector2ByScalar(v21, 3);
        float[] result = new float[] {1, 2};
        assertArrayEquals(divide, result,2);
    }

    @Test
    public void testDivideVector3ToScalar() {
        float[] divide = Vector3.divideVector3ByScalar(v32, 2);
        float[] result = new float[] {2, 3, 4};
        assertArrayEquals(divide, result,3);
    }

    @Test
    public void testDivideVector4ToScalar() {
        float[] divide = Vector4.divideVector4ByScalar(v41, 2);
        float[] result = new float[] {1, 3, 4, 1};
        assertArrayEquals(divide, result,4);
    }

    @Test
    public void testCountVector2Length() {
        float length = Vector2.countVector2Length(v21);
        float result = 6.708203932499369F;
        assertEquals(length, result,1);
    }

    @Test
    public void testCountVector3Length() {
        float length = Vector3.countVector3Length(v31);
        float result = 10.488088481701515F;
        assertEquals(length, result,1);
    }

    @Test
    public void testCountVector4Length() {
        float length = Vector4.countVector4Length(v41);
        float result = 10.392304845413264F;
        assertEquals(length, result,1);
    }

    @Test
    public void testNormalizeVector2() {
        float[] normalize = Vector2.normalizeVector2(v21);
        float[] result = new float[] {0.4472136F, 0.89442719099991589F};
        assertArrayEquals(normalize, result,2);
    }

    @Test
    public void testNormalizeVector3() {
        float[] normalize = Vector3.normalizeVector3(v31);
        float[] result = new float[] {0.19069251F, 0.4767313F, 0.8581163F};
        assertArrayEquals(normalize, result,3);
    }

    @Test
    public void testNormalizeVector4() {
        float[] normalize = Vector4.normalizeVector4(v41);
        float[] result = new float[] {0.19245009F, 0.5773503F,0.76980036F, 0.19245009F};
        assertArrayEquals(normalize, result,4);
    }

    @Test
    public void testScalarMultiplyVectors2() {
        float scalarMultiply = Vector2.scalarMultiplyVectors2(v21, v22);
        float result = 78;
        assertEquals(scalarMultiply, result,1);
    }

    @Test
    public void testScalarMultiplyVectors3() {
        float scalarMultiply = Vector3.scalarMultiplyVectors3(v31, v32);
        float result = 110;
        assertEquals(scalarMultiply, result,1);
    }

    @Test
    public void testScalarMultiplyVectors4() {
        float scalarMultiply = Vector4.scalarMultiplyVectors4(v41, v42);
        float result = 108;
        assertEquals(scalarMultiply, result,1);
    }

    @Test
    public void testProductVectors3() {
        float[] product = Vector3.productVectors3(v31, v32);
        float[] result = new float[] {-14, 20, -8};
        assertArrayEquals(product, result,3);
    }

    @Test
    public void testColumnVector2() {
        float[][] arr = Vector2.columnVector(v21, 2);
        float[][] result = new float[][] {{3}, {6}};
        assertArrayEquals(arr, result);
    }

    @Test
    public void testColumnVector3() {
        float[][] arr = Vector3.columnVector(v31, 3);
        float[][] result = new float[][] {{2}, {5}, {9}};
        assertArrayEquals(arr, result);
    }

    @Test
    public void testColumnVector4() {
        float[][] arr = Vector4.columnVector(v41, 4);
        float[][] result = new float[][] {{2}, {6}, {8}, {2}};
        assertArrayEquals(arr, result);
    }
    */



}