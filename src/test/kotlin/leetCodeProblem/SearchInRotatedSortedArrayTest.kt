package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals
internal class SearchInRotatedSortedArrayTest{
    private val testSearchRotate = SearchInRotatedSortedArray();

    @Test
    fun case1() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 4;
        val expected = 0;
        checkTarget(nums, target, expected);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 3;
        val expected = -1;
        checkTarget(nums, target, expected);    }
    @Test
    fun case3() {
        val nums = intArrayOf(1)
        val target = 0;
        val expected = -1;
        checkTarget(nums, target, expected);
    }
    private fun checkTarget(nums:IntArray, target:Int, expected:Int){
        var sol = testSearchRotate.solutionBruteForceOptimized(nums, target);
        assertEquals(expected,sol)
        testSearchRotate.solutionBinarySearch(nums, target);
        assertEquals(expected,sol)
    }
}
