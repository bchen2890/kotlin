package leetCodeProblem

import kotlin.math.exp
import kotlin.test.Test
import kotlin.test.assertContentEquals

internal class ProductOfArrayExceptSelfTest {
    private val testProduct = ProductOfArrayExceptSelf();
    @Test
    fun case1() {
        val nums = intArrayOf(1,2,3,4)
        val expected = intArrayOf(24,12,8,6);
        val answer = testProduct.solution(nums);
        assertContentEquals(expected,answer);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(-1,1,0,-3,3)
        val expected = intArrayOf(0,0,9,0,0);
        val answer = testProduct.solution(nums);
        assertContentEquals(expected,answer);
    }
}