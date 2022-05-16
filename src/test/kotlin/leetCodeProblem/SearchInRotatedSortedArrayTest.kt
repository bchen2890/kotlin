package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals
internal class SearchInRotatedSortedArrayTest{
    private val testSearchRotate = SearchInRotatedSortedArray();

    @Test
    fun case1() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 4;
        checkTarget(nums, target);
    }
    @Test
    fun case2() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 3;
        checkTarget(nums, target);
    }
    @Test
    fun case3() {
        val nums = intArrayOf(1)
        val target = 0;
        checkTarget(nums, target);
    }
    private fun checkTarget(nums:IntArray, target:Int){
        var sol = testSearchRotate.solutionBruteForceOptimized(nums, target);
        assertEquals(target,nums[sol])
    }
}
