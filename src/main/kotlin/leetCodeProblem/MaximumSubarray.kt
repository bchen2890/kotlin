package leetCodeProblem

/**
 * @param nums an array of integers.
 * @return the largest sum of contiguous subarrays (containing at least one number)
 */
class MaximumSubarray {
    /* Brute Force Solution. O(n^2). Not accepted because of Time Limit Exceeded. */
    fun solutionBruteForce(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var sum:Int
        for (i in nums.indices){
            sum = 0
            for (j in i until nums.size){
                sum += nums[j]
                max = max.coerceAtLeast(sum)
            }
        }
        return max
    }
    /* Brute Force Optimized Solution. O(n) */
    fun solutionBruteForceOptimized(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var sum = 0
        for (i in nums.indices){
            sum = if(sum>0) sum+nums[i] else nums[i];
            max = max.coerceAtLeast(sum)
        }
        return max
    }
}