package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximumSubarrayTest {
    private val testMaxSubarray = MaximumSubarray();
    @Test
    fun case1() {
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        val expected = 6;
        checkMax(nums, expected);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(1)
        val expected = 1;
        checkMax(nums, expected);
    }
    @Test
    fun case3() {
        val nums = intArrayOf(5,4,-1,7,8)
        val expected = 23;
        checkMax(nums, expected);
    }
    fun checkMax(nums:IntArray,expected:Int){
        var sol = testMaxSubarray.solutionBruteForce(nums);
        assertEquals(expected,sol)
        sol = testMaxSubarray.solutionBruteForceOptimized(nums);
        assertEquals(expected,sol)
    }
}