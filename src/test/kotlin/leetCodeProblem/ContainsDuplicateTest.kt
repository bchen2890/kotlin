package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ContainsDuplicateTest {
    private val testDuplicate = ContainsDuplicate();
    @Test
    fun case1() {
        val nums = intArrayOf(1,2,3,1)
        val expected = true;
        checkMax(nums, expected);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(1,2,3,4)
        val expected = false;
        checkMax(nums, expected);
    }
    @Test
    fun case3() {
        val nums = intArrayOf(1,1,1,3,3,4,3,2,4,2)
        val expected = true;
        checkMax(nums, expected);
    }
    private fun checkMax(nums:IntArray, expected:Boolean){
        var contains = testDuplicate.solutionBruteForce(nums);
        assertEquals(expected, contains);
    }
}