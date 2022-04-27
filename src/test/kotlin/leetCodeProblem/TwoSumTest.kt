package leetCodeProblem

import kotlin.test.Test
import kotlin.test.assertEquals
internal class TwoSumTest {
    private val testTwoSum: TwoSum = TwoSum()

    @Test
    fun case1() {
        val target = 9
        val nums = intArrayOf(2,7,11,15)
        checkSum(target,nums)
    }

    @Test
    fun case2() {
        val target = 6
        val nums = intArrayOf(3,2,4)
        checkSum(target,nums)
    }

    @Test
    fun case3() {
        val target = 6
        val nums = intArrayOf(3,3)
        checkSum(target,nums)
    }

    @Test
    fun case4() {
        val target = 8
        val nums = intArrayOf(1,3,4,2,5)
        checkSum(target,nums)
    }

    @Test
    fun case5() {
        val target = 13
        val nums = intArrayOf(4,3,8,2,5)
        checkSum(target,nums)
    }

    @Test
    fun case6() {
        val target = 62
        val nums = intArrayOf(34,43,13,89,31,57,20,57,70,49,2,66,100)
        checkSum(target,nums)
    }

    private fun checkSum(target:Int, nums: IntArray){
        var sol = testTwoSum.solutionBruteForce(nums, target);
        assertEquals(target, (nums[sol[0]]+nums[sol[1]]));
        sol = testTwoSum.solutionHashSet(nums, target);
        assertEquals(target, (nums[sol[0]]+nums[sol[1]]));
        sol = testTwoSum.solutionHashMap(nums,target);
        assertEquals(target, (nums[sol[0]]+nums[sol[1]]));
        sol = testTwoSum.solutionBinarySearch(nums,target);
        assertEquals(target, (nums[sol[0]]+nums[sol[1]]));
    }
}