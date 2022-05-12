package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximumProductSubarrayTest {
    private val testMaxProdSubarray = MaximumProductSubarray();

    @Test
    fun case1() {
        val nums = intArrayOf(2,3,-2,4)
        val expected = 6;
        checkMax(nums, expected);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(-2,0,-1)
        val expected = 0
        checkMax(nums, expected);
    }
    @Test
    fun case3() {
        val nums = intArrayOf(-2)
        val expected = -2
        checkMax(nums, expected);
    }
    private fun checkMax(nums:IntArray, expected:Int){
        var sol = testMaxProdSubarray.solutionBruteForce(nums);
        assertEquals(expected,sol)
    }
}