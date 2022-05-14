package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals

internal class FindMinimunInRotatedSortedArrayTest {
    private val testMinRotate = FindMinimunInRotatedSortedArray();

    @Test
    fun case1() {
        val nums = intArrayOf(3,4,5,1,2)
        val expected = 1;
        checkMin(nums, expected);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val expected = 0;
        checkMin(nums, expected);
    }
    @Test
    fun case3() {
        val nums = intArrayOf(11,13,15,17)
        val expected = 11;
        checkMin(nums, expected);
    }
    private fun checkMin(nums:IntArray, expected:Int){
        var sol = testMinRotate.solutionBruteForceOptimized(nums);
        assertEquals(expected,sol)
    }
}